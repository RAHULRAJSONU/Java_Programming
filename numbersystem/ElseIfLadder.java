package raghusir;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		System.out.println("Input the number");
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		if(inp%3==0 && inp%5==0){
			System.out.println("Sanju weds Geeta");
		}
		else if (inp%3==0) {
			System.out.println("Sanju");
		}
		else if (inp%5==0) {
			System.out.println("Geeta");
		}
		else{
			System.out.println("No match fount");
		}
		sc.close();
	}
}
