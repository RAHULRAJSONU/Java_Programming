package raghusir;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		ReverseNumber rv=new ReverseNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number you want to reverse.");
		int n=sc.nextInt();
		System.out.println("Reverse of given number "+n+" is : "+rv.reverseNumber(n));
		sc.close();
	}
	int reverseNumber(int num){
		int rev=0;
		while(num!=0){
			int t=num%10;
			rev=rev*10+t;
			num=num/10;
		}
		return rev;
	}
}
