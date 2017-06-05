package raghusir.saterdayprog;

public class CountDigit {
	public static void main(String[] args) {
		System.out.println(countDigit(569823));
	}
	static int countDigit(int n){
		int dc=0;
		do {
			n=n/10;
			dc++;
		} while (n>0);
		return dc;
	}
}
