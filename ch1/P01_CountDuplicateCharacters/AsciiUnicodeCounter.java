package P01_CountDuplicateCharacters;

import java.util.TreeMap;

public class AsciiUnicodeCounter {
	public static TreeMap<String, Integer> counter(String str) {
		var result = new TreeMap<String, Integer>();
		
		for (int i = 0; i< str.length() ; i++ ) {
			
			String target = String.valueOf(Character.toChars(str.codePointAt(i)));
			
			if(i< str.length() -1 && str.codePointCount(i, i+2) == 1)
				i++;

			result.compute(target, (k, v) -> (v==null)? 1: ++v);
		}
		
		return result;
	} 

}
