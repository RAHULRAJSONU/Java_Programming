package raghusir;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		int marks=0;
		char grade='L';
		System.out.println("Enter your marks...");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>90 && marks<=100){
			grade='A';
		}else if(marks>80 && marks<=90){
			grade='B';
		}else if(marks>70 && marks<=80){
			grade='C';
		}else if(marks>60 && marks<=70){
			grade='D';
		}else{
			grade='E';
		}
		System.out.println("You deserve grade "+grade);
		sc.close();
	}
}
