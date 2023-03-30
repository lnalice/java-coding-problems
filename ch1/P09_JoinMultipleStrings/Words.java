package P09_JoinMultipleStrings;


public class Words {
	static String JoinerWithSB(String separator, String...words) {
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			result.append(separator + word);
		}
		
		return result.toString().stripLeading();
	}
}
