package raghusir.conversion;

import java.util.Scanner;

public class ConvertFromDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("Converted value : "+convertFromDec(n,base));
		sc.close();
	}
	
	static String convertFromDec(int n, int base){
		String v="";
		while(n>0){
			int r=n%base;
			if(r<10){
				v=r+v;
			}else{
				v=(char)(r+55)+v;
			}
			n=n/base;
		}
		return v;
	}
}
