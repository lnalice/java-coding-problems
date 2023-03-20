package P05_CountVowelsAndConsonants;

import java.util.*;
//import javafx.util.*;
import P00_Util.Pair;

public class Words {
	static HashMap<Character, Integer> counterWithAscii(String str) {

		int[] CapitalLetterOfVowels = {65, 69, 73, 79, 85};
		
		HashMap<Character, Integer> result = new HashMap<>();
		result.put('v', 0);
		result.put('c', 0);
		
		for (int i=0; i<str.length(); i++) {
			int code = str.codePointAt(i);
			if (Arrays.stream(CapitalLetterOfVowels).anyMatch(e->e==code))
				result.replace('v', result.get('v')+1);
			
			else if (Arrays.stream(CapitalLetterOfVowels).anyMatch(e->e==code-32))
				result.replace('v', result.get('v')+1);

			else if ((65<= code && code<=90) || (97<=code && code <=122))
				result.replace('c', result.get('c')+1);
				
//			else 
//				continue;
		}
		
		return result;		
	}
		
	static Pair<Integer, Integer> couterWithHashSet(String str) {
		
		
		final Set<Character> allVowels = new HashSet(Arrays.asList('a','e','i','o','u'));
		
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (allVowels.contains(ch)) {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			}
		} 
		
		return Pair.of(vowels,consonants);
	}
}
