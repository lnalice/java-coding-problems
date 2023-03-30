package P00_Util;

public class MyArray<T>{
	T myType;
	
	public void arrayDisplay (T[] tTypeArr) {
		for(T element : tTypeArr) {
			System.out.println(String.valueOf(element));
		}
	}
}
