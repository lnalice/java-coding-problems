package P00_Util;

import java.time.*;

public class Time {
	
	private static double startNanoseconds;
	private static double endNanoseconds;
	private static double startMilliseconds;
	private static double endMilliseconds;
	
	/**
	 * time function ver1
	 * (for p01)
	 */
	public static double[] nowtoSecondandMillisecond() {
		double nanoseconds = LocalTime.now().toNanoOfDay();
		double milliseconds = nanoseconds*(Math.pow(10, -6));
		double[] result = {nanoseconds, milliseconds}; 
		return result;
	}
	
	
	/**
	 * time function ver2
	 * @param startTime double [nanoseconds, milliseconds]
	 * @param endTime double [nanoseconds, milliseconds]
	 */
	public static void executionTimeofSecAndMillisec(double[] startTime, double[] endTime) {
		
		double executionNanoseconds = endTime[0] - startTime[0];
		double executionMilliseconds = endTime[1] - startTime[1];
		
		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
		
	}
	
	public static double nowToNanoSeconds() {
		double nanoseconds = (double) LocalTime.now().getNano();
		return nanoseconds;
	}
	
	public static double nowToMilliSeconds() {
		double milliseconds = nowToNanoSeconds()*(Math.pow(10, -6));
		return milliseconds;
	}

	public static long executionTime (double startTime, double endTime) {
		return (long) (endTime - startTime);
	}
	
	public static void displayExecutionNanosecondsAndMilliseconds (long executionNanoseconds, long executionMilliseconds) {
		System.out.printf("Execution time : %d ns ( %d ms )\n", (long) executionNanoseconds, (long) executionMilliseconds);
	}
	
	
	/**
	 * time function ver3
	 * (use private static variable)
	 */
	public static void setStartTime () {
		startNanoseconds = (double) LocalTime.now().getNano();
		startMilliseconds = startNanoseconds * (Math.pow(10,  -6));
	}
	
	public static void setEndTime () {
		endNanoseconds = (double) LocalTime.now().getNano();
		endMilliseconds = endNanoseconds * (Math.pow(10,  -6));
	}
	
	public static void displayExecutionTime () {
		long executionNanoseconds = (long) (endNanoseconds - startNanoseconds);
		long executionMilliseconds = (long) (endMilliseconds - startMilliseconds);
		
		System.out.printf("Execution time : %d ns ( %d ms )\n", executionNanoseconds, executionMilliseconds);
	}
}