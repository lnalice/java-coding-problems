package P05_CountVowelsAndConsonants;

import java.util.*;
import P00_Util.Time;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("P05 - Count Vowels And Consonants");
		
		String str = " ... Illinois Mathematics & Science Academy ..."; 
		
		
		double[] startTime = Time.nowtoSecondandMillisecond();
		
		HashMap<Character, Integer>  VowelsAndConsonants = Words.counterWithAskii(str);
				
		double[] endTime = Time.nowtoSecondandMillisecond();
		
		Time.executionTimeofSecAndMillisec(startTime, endTime);
		
		System.out.println("Vowels : " + VowelsAndConsonants.get('v'));
		System.out.println("Consonants : " + VowelsAndConsonants.get('c'));
	}

}