package P03_ReverseWords;

import java.util.*;
import P00_Util.Time;

public class Main {

	public static void main(String[] args) {
		System.out.println("P03 - Reverse Words :");
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		in.close();
		
		
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		String reversedWords = Words.reverseWordsByArray(str);
				
		double[] endTime = Time.nowtoSecondandMillisecond();
		
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];

		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		System.out.println("Reversed :\n" + reversedWords);
	}

}