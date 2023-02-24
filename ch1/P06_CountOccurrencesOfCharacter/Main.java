package P06_CountOccurrencesOfCharacter;

import P00_Util.Time;

public class Main {

	static final char TARGET_CHARACTER = 'w';
	
	final static String INPUT_TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";
		
	public static void main(String[] args) {
		
		System.out.println("P06 - Count Occurrences Of Character");
		System.out.printf("Input text is :\n%s\n", INPUT_TEXT);
		
		
		System.out.println("\nMap based soultion:");
		
		double startNanoSeconds = Time.nowToNanoSeconds();
		double startMilliSeconds = Time.nowToMilliSeconds();
						
		int number_map = Words.counterWithMap(TARGET_CHARACTER, INPUT_TEXT);
		
		double endNanoSeconds = Time.nowToNanoSeconds();
		double endMilliSeconds = Time.nowToMilliSeconds();
		
		Time.displayExecutionNanosecondsAndMilliseconds(
				Time.executionTime(startNanoSeconds, endNanoSeconds), 
				Time.executionTime(startMilliSeconds, endMilliSeconds));
		
		System.out.printf("Character '%c' occured %d Time(s)\n", TARGET_CHARACTER, number_map);
		

		
		System.out.println("\nString based soultion:");
		
		startNanoSeconds = Time.nowToNanoSeconds();
		startMilliSeconds = Time.nowToMilliSeconds();
						
		int number_string = Words.counterWithString(TARGET_CHARACTER, INPUT_TEXT);
		
		double endNanoSeconds2 =  Time.nowToNanoSeconds();
		double endMilliSeconds2 = Time.nowToMilliSeconds();
		
		Time.displayExecutionNanosecondsAndMilliseconds(
				Time.executionTime(startNanoSeconds, endNanoSeconds2), 
				Time.executionTime(startMilliSeconds, endMilliSeconds2));
		
		System.out.printf("Character '%c' occured %d Time(s)\n", TARGET_CHARACTER, number_string);
		
		
	}

}