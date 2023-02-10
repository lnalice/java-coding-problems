package P01_CountDuplicateCharacters;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		

		System.out.println("______ What is the sentence you want to count ______");

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		char[] sentence = str.toCharArray(); 

		in.close();
		
		var initialResult = InitialCounter.counter(sentence);
		var improvedResult = ImprovedCounter.counter(sentence);
		var asciiUnicodeResult =  AsciiUnicodeCounter.counter(str);

		
		System.out.println("initial counter is  : " + initialResult);
		System.out.println("improved counter is : " + improvedResult);
		System.out.println("additory counter is : " + asciiUnicodeResult);
		
	}
}
