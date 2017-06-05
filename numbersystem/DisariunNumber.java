package raghusir.assignment;

import java.util.Scanner;

public class DisariunNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isDisarium(n)){
			System.out.println("Yes!, "+n+" is Disarium number.");
		}else{
			System.out.println("No!, "+n+" is not an Disarium number.");
		}		
		sc.close();
		/*int c=1;
		for(int i=1;i<=100000;i++){				
			if(isDisarium(i)){
				System.out.println(c+"). "+i+" : is Disarium number");
				c++;
			}
			
		}*/
	}
	static int calPower(int number, int power){
		int p=1;
		while(power>0){
			p=p*number;
			power--;
		}
		return p;
	}
	static int countDigit(int n){
		int c=0;
		while(n!=0){
			n=n/10;
			c++;
		}
		return c;
	}
	static boolean isDisarium(int n){
		if(n==0){
			return false;
		}else{
		int res=0;
		int temp=n;
		while(n!=0){
			int nm=n%10;
			res+=calPower(nm, countDigit(n));
			n=n/10;
		}
		return (res==temp);
		}
	}
}
