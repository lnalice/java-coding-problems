package P05_CountVowelsAndConsonants;

import java.util.*;
import P00_Util.Time;
import P00_Util.Pair;

public class Main {

	private static final String str = " ... Illinois Mathematics & Science Academy ...";
	
	public static void main(String[] args) {
		
		System.out.println("P05 - Count Vowels And Consonants");
		
		
		System.out.println("\nHashMap And Ascii Solution");
		
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		HashMap<Character, Integer>  VowelsAndConsonants = Words.counterWithAscii(str);
				
		double[] endTime = Time.nowtoSecondandMillisecond();
		
		Time.executionTimeofSecAndMillisec(startTime, endTime);
		
		System.out.println("Vowels : " + VowelsAndConsonants.get('v'));
		System.out.println("Consonants : " + VowelsAndConsonants.get('c'));
		
		
		System.out.println("\nDIY Pair Solution");
		
		Time.setStartTime();
		
		Pair<Integer, Integer> VowelsAndConsonants_Pair = Words.couterWithHashSet(str);
		
		Time.setEndTime();
		
		Time.displayExecutionTime();

		System.out.println("Vowels : " + VowelsAndConsonants_Pair.getX());
		System.out.println("Consonants : " + VowelsAndConsonants_Pair.getY());	
	}

}