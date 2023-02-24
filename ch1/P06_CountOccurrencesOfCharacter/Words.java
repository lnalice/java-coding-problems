package P06_CountOccurrencesOfCharacter;

import java.util.*;

public class Words {

	static int counterWithMap(char target, String text) {
		
		HashMap<Character, Integer> result = new HashMap<>();
		result.put(target, 0);
		
		for(char c : text.toCharArray()) {
			if(c == target)
				result.replace(target, result.get(target)+1);
		}
		
		return result.get(target);
	}
	
	static int counterWithString(char target, String text) {
		
		int result = 0;
		
		for(int i =0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c == target)
				++result;		
		}
		
		return result;
	}
}
