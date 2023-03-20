package P00_Util;

public class Pair<F,S> {
	F first;
	S second;
	
	public Pair(F x, S y) {
		this.first = x;
		this.second = y;
	}
	
	public static <F,S> Pair<F,S> of(F x, S y) {		
		return new Pair<F, S>(x, y);
	}
	
	public F getX () {
		return first;
	}
	public S getY () {
		return second;
	}
}