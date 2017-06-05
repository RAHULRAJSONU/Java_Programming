package raghusir.conversion;

public class OctToDec {
	public static void main(String[] args) {
		OctToDec otd=new OctToDec();		
		System.out.println(otd.OctalToDecimal(45));
	}
	
	int OctalToDecimal(int n){
		int sum=0,c=0;
		while(n>0){
			int r=n%10;
			sum=sum+r*(power(8,c));
			c++;
			n=n/10;
		}
		return sum;
	}

	private int power(int i, int p) {
		int pow=1;
		while(p>0){
			pow=pow*i;
			p--;
		}
		return pow;
	}

}
