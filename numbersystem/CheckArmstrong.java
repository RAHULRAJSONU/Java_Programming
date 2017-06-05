package raghusir.assignment;

import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isArmstrong(n)){
			System.out.println("Yes!, "+n+" is armStrong number.");
		}else{
			System.out.println("No!, "+n+" is not an armStrong number.");
		}		
		sc.close();*/
		//count armStrong between given range
		int c=1;
		for(int i=1;i<=10000;i++){				
			if(isArmstrong(i)){
				System.out.println(c+"). "+i+" : is armStrong number");
				c++;
			}
			
		}
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
	static boolean isArmstrong(int n){
		int res=0;
		int temp=n;
		while(n!=0){
			int nm=n%10;
			res+=calPower(nm, countDigit(temp));
			n=n/10;
		}
		return (res==temp);
	}
}
