package raghusir.conversion;

public class BinToDec {
	public static void main(String[] args) {
		BinToDec btd=new BinToDec();
		System.out.println(btd.BinaryToDecimal(1010101));
	}
	
	int BinaryToDecimal(int n){
		int sum=0,c=0;
		while(n>0){
			int r=n%10;
			sum=sum+r*(power(2,c));
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
