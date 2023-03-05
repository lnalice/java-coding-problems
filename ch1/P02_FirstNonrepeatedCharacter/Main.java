package P02_FirstNonrepeatedCharacter;

import java.util.*;
import P00_Util.Time;
import P06_CountOccurrencesOfCharacter.Words;

public class Main {
	
	final static String INPUT_TEXT = "Let's find a First Nonrepeated Character.";
	
	public static void main(String[] args) {
		
		System.out.println("P02 - First Nonrepeated Character");
		System.out.println(INPUT_TEXT);
		System.out.println("Please write input text : ");
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		in.close();
		
				
		System.out.println("\nArrayList soultion:");
		
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		char chasedCharacter = Chaser.firstNonrepeatedCharacter(str);
		
		double[] endTime = Time.nowtoSecondandMillisecond();
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];
		
		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		
		System.out.println("Found Character : " + chasedCharacter);
		

		System.out.println("\nLinkedHashMap soultion:");
		
		Time.setStartTime();
						
		chasedCharacter = Chaser.firstNonrepeatedCharacter_LinkedHashMap(str);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();
		
		System.out.println("Found Character : " + chasedCharacter);
		
		
		System.out.println("\nfunction style soultion:");
		
		Time.setStartTime();
						
		String chasedString = Chaser.firstNonrepeatedCharacter_functionStyle(str);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();
		
		
		System.out.println("Found Character : " + chasedString);
		
				
	}

}