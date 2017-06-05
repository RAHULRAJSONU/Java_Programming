package raghusir;

import java.util.Scanner;

/*
 * program to display number of
 * day in corresponding month.
 * by using switch 
 * 1,3,5,7,8,10,12(31 days)
 * 2(28 or 29 days)
 * 4,6,9,11(30 days)
 * 
 */
public class MonthDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number.");
		switch(sc.nextInt()){
		case 1:		
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days.");
			break;
		case 2:
			System.out.println("28 or 29 Days.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days.");
			break;
				default:
			System.out.println("Sorry! Invalid month number.");
		}
		sc.close();
	}
}
