package raghusir.assignment;

import java.util.Scanner;

public class SpecialTwoDigit {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int x=sc.nextInt();
		if(checkSpecial(x)){
			System.out.println("Yes!.."+x+" is special two digit number");
		}else{
			System.out.println("Sorry!.."+x+" is not a special two digit number");
		}
		sc.close();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial number..");
		int x=sc.nextInt();
		System.out.println("Enter the last number..");
		int y=sc.nextInt();
		int c=1;
		for(int i=x;i<=y;i++){				
			if(checkSpecial(i)){
				System.out.println(c+"). "+i+" : is special two digit number");
				c++;
			}
			
		}
		sc.close();

	}
	
	
	static boolean checkSpecial(int number){
		int re=0;
		int t=number;
		if(number<10||number>99){
			return false;
		}else{
			while(number>=10){
				int n=number%10;
				int n2=number/10;
				re=(n*n2)+(n+n2);
				number=number/10;
			}
			return t==re;
		}
	}

}
