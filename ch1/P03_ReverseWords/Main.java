package P03_ReverseWords;

import java.util.*;
import P00_Util.Time;

public class Main {
	
	final static String INPUT_TEXT = "Reverse this words";

	public static void main(String[] args) {
		
		StringBuilder reversedSb = new StringBuilder();
		System.out.println("P03 - Reverse Words :");
		
		System.out.println("\nArray Solution :");
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		String reversedWords = Words.reverseWordsByArray(INPUT_TEXT);
				
		double[] endTime = Time.nowtoSecondandMillisecond();
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];

		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		System.out.println("Reversed : " + reversedWords);
		
		
		System.out.println("\nStringBuilder Solution :");
		
		Time.setStartTime();
		
		reversedSb = Words.reverseWordsByStringBuilder(INPUT_TEXT);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();
		
		System.out.println("Reversed : " + reversedSb.toString());
		
	}

}
