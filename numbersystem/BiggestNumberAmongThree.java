package raghusir;

import java.util.Scanner;

public class BiggestNumberAmongThree {
	public static void main(String[] args) {
		System.out.println("enter three number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("number "+a+" is biggest");
		}else if(b>c){
			System.out.println("number "+b+" is biggest");
		}else{
			System.out.println("number "+c+" is biggest");
		}
		sc.close();
	}
}
