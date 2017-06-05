package raghusir.conversion;

public class DecToOct {

	public static void main(String[] args) {
		DecToOct dto= new DecToOct();
		System.out.println(dto.DecimalToOctal(45));
	}
	
	String DecimalToOctal(int n){
		String dec="";
		while(n>0){
			int r=n%8;
			dec=r+dec;
			n=n/8;
		}
		return dec;
	}

}
