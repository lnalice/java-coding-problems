package P01_CountDuplicateCharacters;

import java.util.*;

public class InitialCounter {

	public static TreeMap<Character, Integer> counter(char[] sentence) {
		var tmpResult = new HashMap<Character, Integer>();

		for (int i = 0; i< sentence.length ; i++ ) {
			int num = 0;
			char target = sentence[i];
			boolean status = isDuplication(tmpResult, target);
			if(!status) {
				for (int j = 0; j < sentence.length; j++) {
					if(sentence[j] == target)
						num++;				
				};
				tmpResult.put(sentence[i], num);
			}
		}
		TreeMap<Character, Integer> result = sorting(tmpResult);
		
		return result;
	}

	private static boolean isDuplication(HashMap<Character, Integer> tmpResult, char target ) {
		tmpResult.forEach((c,n) -> {
			if (target == c)
				return;
		});
		return false;
	}
	
	private static TreeMap<Character, Integer> sorting(HashMap<Character, Integer> map){

		List<Character> words = new ArrayList<>(map.keySet());
		words.sort(Character::compareTo);
			
		TreeMap<Character, Integer> result = new TreeMap<>();
	
		for (int i=0; i < words.size(); i++) {
			result.put(words.get(i), map.get(words.get(i)));
		}
		
		return result;
	}
	

	public static void main(String[] args) {

		System.out.println("____What is the sentence you want to count____");

		Scanner in = new Scanner(System.in);
		char[] sentence = in.nextLine().toCharArray(); 

		in.close();
		
		var tmpResult = counter(sentence);

		
		System.out.println(tmpResult);
	
	}
}
