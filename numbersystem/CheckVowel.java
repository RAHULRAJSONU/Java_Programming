package raghusir;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to check..");
		String x=sc.nextLine();
		switch (x.toUpperCase()) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("Entered char is vowel");			
			break;
		case "B":
		case "C":
		case "D":
		case "F":
		case "G":
		case "H":
		case "J":
		case "K":
		case "L":
		case "M":
		case "N":
		case "P":
		case "Q":
		case "R":
		case "S":
		case "T":
		case "V":
		case "W":
		case "X":
		case "Y":
		case "Z":
			System.out.println("Enter char is constant.");
			break;
		default:
			System.out.println("Wrong Entry");
		}
		sc.close();
	}

}
