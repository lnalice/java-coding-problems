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

		String result = Words.joinerWithSB(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result);
		

		System.out.println("\nUpdated StringBuilder Method");

		Time.setStartTime();

		String result2 = Words.joinerWithSB_ver2(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result2);

		
		System.out.println("\nStringJoiner Method");

		Time.setStartTime();

		String result3 = Words.joinerWithStringJoiner(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result3);
		
		
		System.out.println("\nString Join Method");

		Time.setStartTime();

		String result4 = String.join(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result4);

		
		System.out.println("\nString Join Method");

		Time.setStartTime();

		String result5 = String.join(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result5);
		
		
		System.out.println("\njava 8 Method");

		Time.setStartTime();

		String result6 = Words.joinerJava8(" ", word1, word2, word3, word4);

		Time.setEndTime();

		Time.displayExecutionTime();

		System.out.println("String : " + result6);
		

	}
}
