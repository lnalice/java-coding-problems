package P09_JoinMultipleStrings;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Words {
	static String joinerWithSB(String delimiter, String...words) {
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			result.append(delimiter + word);
		}
		
		return result.toString().stripLeading();
	}
	
	static String joinerWithSB_ver2(String delimiter, String...words) {
		StringBuilder result = new StringBuilder();
		
		int i = 0;
		for (i = 0; i< words.length -1; i++) {
			result.append(words[i] + delimiter);
		}
		
		result.append(words[i]);
		
		return result.toString();
	}
	
	static String joinerWithStringJoiner(String delimiter, String...words) {
		StringJoiner sj = new StringJoiner(delimiter);
		for (String e : words) {
			sj.add(e);
		}
		
		return sj.toString();
	}
	
	static String joinerJava8(String delimiter, String...words) {
		return Arrays.stream(words, 0, words.length)
				.collect(Collectors.joining(String.valueOf(delimiter)));
	}
	
}
