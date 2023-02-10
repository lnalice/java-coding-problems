package P01_CountDuplicateCharacters;

import java.util.*;

public class ImprovedCounter {

	public static TreeMap<Character, Integer> counter(char[] sentence) {
		var result = new TreeMap<Character, Integer>();
		
		for (int i = 0; i< sentence.length ; i++ ) {
			
			char target = sentence[i];

			result.compute(target, (k, v) -> (v==null)? 1: ++v);
		}
		
		return result;
	}
}