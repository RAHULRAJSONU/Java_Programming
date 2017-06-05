package raghusir.assignment;

import java.util.Scanner;

public class GetArea {
	public static void main(String[] args) {
		GetArea ga=new GetArea();
		Scanner sc=new Scanner(System.in);
		int res=0;
		do {
			System.out.println("Please enter your choice.");
			System.out.println("1. Calculate Area of Circle.");
			System.out.println("2. Calculate Area of Ractangle.");
			System.out.println("3. Calculate Area of Square.");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the radius of the circle.");
				double r = sc.nextDouble();
				System.out.println("Area = " + ga.circleArea(r));
				break;
			case 2:
				System.out.println("Enter the length of the rectangle.");
				double l = sc.nextDouble();
				System.out.println("Enter the width of the rectangle.");
				double w = sc.nextDouble();
				System.out.println("Area = " + ga.ractangeArea(l, w));
				break;
			case 3:
				System.out.println("Enter the Side of the square.");
				double a = sc.nextDouble();
				System.out.println("Area = " + ga.squareArea(a));
				break;
			default:
				System.out.println("Enter right choice.....");
			}
			System.out.println("Love to continue press : 9; for exit press : 0");
			res=sc.nextInt();
		} while (res==9);
		sc.close();
	}
	double circleArea(double radius){
		return 3.14*(radius*radius);
	}
	
	double ractangeArea(double length, double width){
		return length*width;
	}
	double squareArea(double side){
		return side*side;
	}

}
