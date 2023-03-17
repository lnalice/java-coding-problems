package P04_ContainsOnlyDigits;
import java.lang.Long;

public class Words {

/*
 * solution with exception is not good.
 * because its output is also true even though input is the kind of '-4'
 * we want to find only digits(number; 4 not -4)
 */
	public static boolean isDigitByException(String str) {
		
		try {	
			int i = 0;
			while(i<str.length()) {
				long numberTypeLong = Long.decode(String.valueOf(str.charAt(i)));
				++i;
			}
		} catch (NumberFormatException numError) {
			return false;
		}
		return true;
	}
	
	public static boolean isDigits_java8(String str) {
		
		return !str.chars()
				.anyMatch(n -> !Character.isDigit(n));
	}
	
	public static boolean isDigits_regularExpression(String str) {
		return str.matches("[0-9]+");
	}
}