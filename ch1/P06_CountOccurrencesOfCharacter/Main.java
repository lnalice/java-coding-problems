package P06_CountOccurrencesOfCharacter;

import P00_Util.Time;

public class Main {

	static final char TARGET_CHARACTER = 'w';
	
	final static String INPUT_TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";
	
	static Time time = new Time();

	
	public static void main(String[] args) {
		
		System.out.println("P06 - Count Occurrences Of Character");
		System.out.printf("Input text is :\n%s\n", INPUT_TEXT);
		
		
		System.out.println("\nMap based soultion:");
		
		double startNanoSeconds = time.nowToNanoSeconds();
		double startMilliSeconds = time.nowToMilliSeconds();
						
		int number_map = Words.counterWithMap(TARGET_CHARACTER, INPUT_TEXT);
		
		double endNanoSeconds = time.nowToNanoSeconds();
		double endMilliSeconds = time.nowToMilliSeconds();
		
		time.displayExecutionNanosecondsAndMilliseconds(
				time.executionTime(startNanoSeconds, endNanoSeconds), 
				time.executionTime(startMilliSeconds, endMilliSeconds));
		
		System.out.printf("Character '%c' occured %d time(s)\n", TARGET_CHARACTER, number_map);
		

		
		System.out.println("\nString based soultion:");
		
		startNanoSeconds = time.nowToNanoSeconds();
		startMilliSeconds = time.nowToMilliSeconds();
						
		int number_string = Words.counterWithString(TARGET_CHARACTER, INPUT_TEXT);
		
		double endNanoSeconds2 =  time.nowToNanoSeconds();
		double endMilliSeconds2 = time.nowToMilliSeconds();
		
		time.displayExecutionNanosecondsAndMilliseconds(
				time.executionTime(startNanoSeconds, endNanoSeconds2), 
				time.executionTime(startMilliSeconds, endMilliSeconds2));
		
		System.out.printf("Character '%c' occured %d time(s)\n", TARGET_CHARACTER, number_string);
		
		
	}

}