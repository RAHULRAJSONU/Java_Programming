package raghusir.conversion;

import java.util.Scanner;

public class ConvertToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number(Hex, octa or binary)");
		String st=sc.next();
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("Converted value : "+convert(st,base));
		sc.close();
	}
	
	static int convert(String st, int base){
		int sum=0;
		int c=0;
		for(int i=st.length()-1;i>=0;i--){
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9'){
				sum=sum+(ch-48)*power(base,c);
			}
			else if(ch>='A' && ch<='Z'){
				sum=sum+(ch-55)*power(base,c);
			}else{
				sum=sum+(ch-87)*power(base,c);
			}
			c++;
		}
		return sum;
	}
	
	static int power(int number, int power){
		int pow=1;
		while(power>0){
			pow=pow*number;
			power--;
		}
	    return pow;
	}
}
