package P02_FirstNonrepeatedCharacter;

import java.util.*;
import java.time.*;

public class Main {
	
	private static double[] nowToSeconds() {
		double nanoseconds = LocalTime.now().toNanoOfDay();
		double milliseconds = nanoseconds*(Math.pow(10, -6));
		double[] result = {nanoseconds, milliseconds}; 
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		in.close();
		
		double[] startTime = nowToSeconds();
		
		char chasedCharacter = Chaser.firstNonrepeatedCharacter(str);
		
		double[] endTime = nowToSeconds();
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];
		
		
		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		
		System.out.println("Found Character : " + chasedCharacter);
				
	}

}
