package raghusir;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number: ");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if(rs){
			System.out.println(n+" is palindrome. ");
		}else{
			System.out.println(n+" is not palindrome. ");
		}
		sc.close();
	}
	
	static boolean isPalindrome(int n){
		int tn=n;
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return (rev==tn);
	}
}
