import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		System.out.println("Main methos starts");		
		CheckOddEven.checkOddEvenWithoutIfStmt();
		System.out.println("Main methos end..");
	}
	/*
	 * Check the number is even or
	 * odd with modular "%" operator.
	 */
	public static void checkOddEvenWithoutModular(){
		System.out.println("Enter the number that you wnt to check");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		if((input/2)*2==input){
			System.out.println("Even");
			
		}else{
			System.out.println("Odd");
		}
		sc.close();

	}
	/*
	 * Check the number is even 
	 * or Odd without modular "%"
	 * operator
	 */
	public static void checkOddEvenWithModular(){
		System.out.println("Enter the number that you wnt to check");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		if(input%2==0){
			System.out.println("Even");
			
		}else{
			System.out.println("Odd");
		}
		sc.close();
	}
	/*
	 * check the number is even
	 * or odd without if statement
	 */
	public static void checkOddEvenWithoutIfStmt(){
		System.out.println("Enter the number that you want to check");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] st={"Even","Odd"};
		System.out.println(n+" is "+st[n%2]+" number");
		sc.close();
	}
}

