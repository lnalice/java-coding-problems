package P00_Util;

import java.time.*;

public class Time {
	public static double[] nowtoSecondandMillisecond() {
		double nanoseconds = LocalTime.now().toNanoOfDay();
		double milliseconds = nanoseconds*(Math.pow(10, -6));
		double[] result = {nanoseconds, milliseconds}; 
		return result;
	}
	
	/**
	 * 
	 * @param startTime double [nanoseconds, milliseconds]
	 * @param endTime double [nanoseconds, milliseconds]
	 */
	public static void executionTimeofSecAndMillisec(double[] startTime, double[] endTime) {
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];
		
		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		
	}
	
}
