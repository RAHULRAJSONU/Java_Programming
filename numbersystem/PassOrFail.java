package raghusir;

import java.util.Scanner;

public class PassOrFail {
	public static void main(String[] args) {
		PassOrFail.checkPassOrFailWithAnd();
	}
	public static void CheckPassOrFailWithOr(){
		System.out.println("Enter your marks of four subject");
		Scanner sc=new Scanner(System.in);
		int sb1=sc.nextInt();
		int sb2=sc.nextInt();
		int sb3=sc.nextInt();
		int sb4=sc.nextInt();
		if(sb1<35 || sb2<35 || sb3<35 ||sb4<35){
			System.out.println("Sorry you are FAIL.");
		}else{
			System.out.println("Congratulations! you are PASS");
		}
		sc.close();
	}
	public static void checkPassOrFailWithAnd(){
		System.out.println("Enter your marks of four subject");
		Scanner sc=new Scanner(System.in);
		int sb1=sc.nextInt();
		int sb2=sc.nextInt();
		int sb3=sc.nextInt();
		int sb4=sc.nextInt();
		if(sb1<35 && sb2<35 && sb3<35 && sb4<35){
			System.out.println("Congratulations! you are PASS");
		}else{
			System.out.println("Sorry! you are FAIL");
		}
		sc.close();
	}
}
