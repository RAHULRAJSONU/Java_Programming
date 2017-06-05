package raghusir.assignment;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int rs;
		do{
		CheckPrimeNumber cpn= new CheckPrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		if(cpn.isPrimeWithWhile(n)){
			System.out.println("Yes!, the number : "+n+" is prime numer" );
		}else{
			System.out.println("Yes!, the number : "+n+" is not prime numer" );
			break;
		}
		System.out.println("Want to continue press :1");
		rs=sc.nextInt();
		if(rs!=1)
		sc.close();
		}while(rs==1);
		System.out.println("-----------END----------------");
	}
	/*public static void main(String[] args) {
		for(int i=1;i<=100;i++){		
		CheckPrimeNumber cpn= new CheckPrimeNumber();		
		if(cpn.isPrimeWithWhile(i)){
			System.out.println("Yes!, the number : "+i+" is prime numer" );
		}
		}
		System.out.println("-----------END----------------");
	}*/
	boolean isPrime(int n){
		int flag=0;
		int m=n/2;
		for(int i=2;i<=m;i++){
			if(n%i==0){
				flag++;
			}
		}
		return flag==0;
	}
	boolean isPrimeWithWhile(int i){
		int d=2;
		while(d<i/2){
			if(i%d==0){
				return false;
			}
		 d++;
		}
		return true;
	}
}
