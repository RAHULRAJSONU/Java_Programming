package raghusir.assignment;

import java.util.Scanner;

class CheckStrong {
	public static void main(String[] args) {
		CheckStrong cs=new CheckStrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int x=sc.nextInt();
		if(cs.isStorng(x)){
			System.out.println("Yes!.."+x+" is strong number");
		}else{
			System.out.println("Sorry!.."+x+" is not strong number");
		}
		sc.close();
		//System.out.println(cs.fact(5));
	}
	/*public static void main(String[] args) {
		CheckStrong cs=new CheckStrong();
		int c=1;
		for(int i=1;i<=100000;i++){				
			if(cs.isStorng(i)){
				System.out.println(c+"). "+i+" : is strong number");
				c++;
			}
			
		}
		
	}*/
	/*int fact(int n){
		int f=1;
		while(n>1){
			f=f*n;
			n--;
		}
		return f;
	}*/
	boolean isStorng(int number){
		int tn=number;
		int s=0;		
		while(number>0){
			int f=1;
			int n=number%10;			
			while(n>1){
				f=f*n;
				n--;
			}
			s=s+f;			
			number=number/10;		
		}
		return tn==s;	
	}
}
