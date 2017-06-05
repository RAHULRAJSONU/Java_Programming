package raghusir;

import java.util.Scanner;

public class ReadArrayFromUser {

	public static void main(String[] args) {
		arraySum(readArray());
	}
	
	static double[] readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements do you have?");
		int n=sc.nextInt();
		double[] x=new double[n ];
		System.out.println("Enter "+n+" number");
		for(int i=0;i<x.length;i++){
			x[i]=sc.nextDouble();
		}
		return x;
	}
	
	static void arraySum(double[] d){
		double sum=0;
		for(int i=0;i<d.length;i++){
			sum+=d[i];
		}
		System.out.println("Sum of entered array : "+sum);
	}

}
