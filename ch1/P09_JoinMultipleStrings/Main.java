package P09_JoinMultipleStrings;

import java.lang.String;
import P00_Util.Time;

public class Main {

	private static final String word1 = "Dream";
	private static final String word2 = "like";
	private static final String word3 = "a";
	private static final String word4 = "whale";

	public static void main(String[] args) {
		
		System.out.println("P09 - Join Multiple Strings");
		
		System.out.println("\nStringBuilder Method");
		
		Time.setStartTime();
		
		String result = Words.JoinerWithSB(" ", word1, word2, word3, word4);
		
		Time.setEndTime();
		
		System.out.println("String : " + result);
		
		Time.displayExecutionTime();
		
	}
}
