package raghusir;

import java.util.Scanner;

public class CheckPerfectNumber {
	public static void main(String[] args) {
		CheckPerfectNumber cp=new CheckPerfectNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");		
		int n=sc.nextInt();
		if(cp.isPerfect(n)){
			System.out.println("Number : "+n+" is perfect.");
		}else{
			System.out.println("Number : "+n+" is not perfect.");
		}
		sc.close();
			
	}
	boolean isPerfect(int num){
		int temp=num;
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum+=i;				
			}
		}
		return (temp==sum);
	}
}
