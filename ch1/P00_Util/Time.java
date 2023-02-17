package P00_Util;

import java.time.*;

public class Time {
	public static double[] nowtoSecondandMillisecond() {
		double nanoseconds = LocalTime.now().toNanoOfDay();
		double milliseconds = nanoseconds*(Math.pow(10, -6));
		double[] result = {nanoseconds, milliseconds}; 
		return result;
	}
	
}
