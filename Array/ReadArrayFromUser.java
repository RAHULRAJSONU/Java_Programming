package raghusir.assignment.array;

import java.util.Scanner;

public class ReadArrayFromUser {
	public static void main(String[] args) {
		int[] res=readArray();
		printArray(res);
		System.out.println("reverse print ----------------------");
		printReverseArray(res);
	}
	private static void printReverseArray(int[] res) {
		for(int i=res.length-1;i>=0;i--){
			System.out.println(res[i]);
		}
	}
	
	private static void printArray(int[] res) {
		for(int r:res){
			System.out.println(r);
		}
	}
	static int[] readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how much element do you have..");
		int num=sc.nextInt();
		int[] ar=new int[num];
		for(int i=0;i<num;i++){
			System.out.println("enter next");
			ar[i]=sc.nextInt();
		}
		sc.close();
		return ar;
		
	}
}
