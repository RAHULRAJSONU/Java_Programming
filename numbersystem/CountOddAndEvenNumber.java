package raghusir;

import java.util.Scanner;

public class CountOddAndEvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		CountOddAndEvenNumber coe=new CountOddAndEvenNumber();
		coe.countOddEven(n);
		sc.close();
	}
	void countOddEven(int num){
		int i=0;
		int odd=0;
		int noe=0;
		int even=0;
		while(num!=0){
			i++;
			noe=num%100;
			if(noe%2==0){
				even++;
			}else{
				odd++;
			}
			num=num/10;			
		}
		System.out.println("total digit= "+i);
		System.out.println("total even digit= "+even);
		System.out.println("total odd digit= "+odd);

	}
}
