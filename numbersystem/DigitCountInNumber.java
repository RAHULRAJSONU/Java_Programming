package raghusir;

import java.util.Scanner;

public class DigitCountInNumber {
	
	public static void main(String[] args) {
		DigitCountInNumber dc=new DigitCountInNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();		
		System.out.println("Total : "+dc.countTotalDigit(n)+" Digits are there in : "+n);
		sc.close();
	}
	int countTotalDigit(int num){
		int count=0;
		while(num!=0){
			num=num/10;
			count++;
		}
		return count;
	}
}
