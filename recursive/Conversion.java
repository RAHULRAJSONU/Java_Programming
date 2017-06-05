package raghusir.recursive;

public class Conversion {

	public static void main(String[] args) {
		decimalToBinary(8);
	}
	
	static void decimalToBinary(int n){
		if(n>1)
			decimalToBinary(n/2);
		System.out.print(n%2);
	}
	
	static void decimalToOcta(int n){
		if(n>1)
			decimalToOcta(n/8);
		System.out.print(n%8);
	}
	
	static void decimalToHexa(int n){
		if(n>1)
			decimalToHexa(n/16);
		int r=n%16;
		if(r<10)
			System.out.println(r);
		else
			System.out.println((char)(r+55));
	}

}
