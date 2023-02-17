package P03_ReverseWords;

import java.util.*;

public class Words {
	
	static String reverseWordsByArray(String str) {
		
		ArrayList<String> reversedArr = new ArrayList<>();
				
		for(int i = str.length()-1; i >=0; i--)
			reversedArr.add(String.valueOf(str.charAt(i)));
		
		return String.join("", reversedArr);
				
	}
}