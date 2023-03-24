package P08_RemoveWhitespacesFromString;

import P00_Util.Time;

public class Main {

	private static String INPUT_TEXT =   "      My high\n\n school,        the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. \r"
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, \t"
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.           ";
	
	public static void main(String[] args) {
		System.out.println("P08 - Remove Whitespaces From String");
		
		System.out.println("\nString Method Solution");
		
		Time.setStartTime();
		
		System.out.println("String : " + INPUT_TEXT.replaceAll("\\s", ""));
		
		Time.setEndTime();
		
		Time.displayExecutionTime();		
	}
}