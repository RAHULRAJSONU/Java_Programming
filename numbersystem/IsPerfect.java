package raghusir.saterdayprog;

import java.util.Scanner;
public class IsPerfect {
	public static void main(String[] args) {
		IsPerfect cp=new IsPerfect();
		//cp.printPerfectWithinRange(2,10000000);
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
	void printPerfectWithinRange(int init, int upto){		
		for(int i=0;i<=1000;i++){
			if(isPerfect(i)){
				System.out.println(i+" is perfect number");
			}
		}
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