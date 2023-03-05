package P02_FirstNonrepeatedCharacter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chaser {

	public static char firstNonrepeatedCharacter(String str) {
		ArrayList<Character> existedTarget = new ArrayList<>();
		
		for (int i=0; i <str.length();  i++) {
			
			char target = str.charAt(i);
			CharSequence cs = String.valueOf(target);
			String subStr = str.substring(i+1);
			
			if(!subStr.contains(cs) && !existedTarget.contains(target)) 
				return target;
			
			existedTarget.add(target);
		}
		
		return Character.MIN_VALUE;
	}
	
	public static char firstNonrepeatedCharacter_LinkedHashMap (String str) {
		Map<Character, Integer> result = new LinkedHashMap<>();
		
		for (char ch : str.toCharArray()) {
			result.compute(ch, (k,v) -> (v == null)? 1: ++v);
		}
		
		for (Map.Entry<Character, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();			
		}
		
		return Character.MIN_VALUE;
	}
	
	public static String firstNonrepeatedCharacter_functionStyle(String str) {
		Map<Integer, Long> result = str.codePoints()
				.mapToObj(cp -> cp)
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new, Collectors.counting()));
		
		int cp = result.entrySet().stream()
				.filter(e -> e.getValue() == 1L)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse(Integer.valueOf(Character.MIN_VALUE));
		return String.valueOf(Character.toChars(cp));
	} 
}
