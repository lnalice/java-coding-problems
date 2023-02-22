package P05_CountVowelsAndConsonants;

import java.util.*;

public class Words {
	public static HashMap<Character, Integer> counterWithAskii(String str) {

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
}
