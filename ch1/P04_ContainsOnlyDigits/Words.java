package P04_ContainsOnlyDigits;
import java.lang.Long;

public class Words {

	public static boolean isDigitByException(String str) {
		
		try {	
//			only 0~9
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
}