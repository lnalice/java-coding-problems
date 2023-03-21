package P07_ConvertStringToIntLongFloatDouble;

import P00_Util.Time;

public class Main {

	private static final String str = "1233";
	
	public static void main(String[] args) {
		System.out.println("P07 - Convert String to Int, Long, Float, Double");
		
		System.out.printf("String is %s\n", str);
		
		System.out.println("\nParse Solution");
		
		Time.setStartTime();
		
		try {
			
		int toInt = Integer.parseInt(str);
		Long toLong = Long.parseLong(str);
		Float toFloat = Float.parseFloat(str);
		Double toDouble = Double.parseDouble(str);
		
 		Time.setEndTime();

		System.out.print(" ");
 		Time.displayExecutionTime();
		
		System.out.printf(" Integer is %d\n", toInt);
		System.out.printf(" Long is %d\n", toLong);
		System.out.printf(" Float is %f\n", toFloat);
		System.out.printf(" Double is %f\n", toDouble);
				
		}
		
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		
		
		try {
			System.out.println("\nValueof Solution");
			
			Integer toInt2 = Integer.valueOf(str);
			Long toLong2 = Long.valueOf(str);
			Float toFloat2 = Float.valueOf(str);
			Double toDouble2 = Double.valueOf(str);
			
			Time.setEndTime();

			System.out.print(" ");
	 		Time.displayExecutionTime();
			
			System.out.printf(" Integer is %d\n", toInt2);
			System.out.printf(" Long is %d\n", toLong2);
			System.out.printf(" Float is %f\n", toFloat2);
			System.out.printf(" Double is %f\n", toDouble2);
			
			
		}
		
		catch(NumberFormatException e) {
			
		}
	}

}
