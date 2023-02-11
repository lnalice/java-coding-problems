package P02_FirstNonrepeatedCharacter;

import java.util.*;

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
		
		return ' ';
	}
}
