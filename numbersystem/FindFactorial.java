package raghusir.assignment;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		FindFactorial ff=new FindFactorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		System.out.println("Factorial of : "+n+" is ="+ff.getFactorialByWhile(n));
		sc.close();
	}
	
	int getFactorial(int number){
		int fact=1;
		for(int i=1;i<=number;i++){
			fact*=i;
		}
		return fact;
	}
	int getFactorialByWhile(int n){
		int f=1;
		while(n>1){
			f=f*n;
			n--;
		}
		return f;
	}
}
