package P04_ContainsOnlyDigits;

import java.util.*;
import P00_Util.Time;

public class Main {
	
	private static final String INPUT_TEXT = "45566336754493420932877387482372374982374823"
            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
            + "234745374657346578465783467843653748654376837463847654382382938793287492326";

	public static void main(String[] args) {
		System.out.println("P04 - Contains Only Digits :");
		
		System.out.println("\nException Solution :");
		
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		boolean isDigitResult = Words.isDigitByException(INPUT_TEXT);
				
		double[] endTime = Time.nowtoSecondandMillisecond();

		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];

		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		System.out.println("Digits :" + isDigitResult);
		
		
		System.out.println("\nJava 8 Solution :");
		
		Time.setStartTime();
		
		isDigitResult = Words.isDigits_java8(INPUT_TEXT);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();
		
		System.out.println("Digits :" + isDigitResult);
		
		
		System.out.println("\nRegular Expression Solution :");
		
		Time.setStartTime();
		
		isDigitResult = Words.isDigits_regularExpression(INPUT_TEXT);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();
		
		System.out.println("Digits :" + isDigitResult);

	}

}
