package raghusir.array;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String st=sc.nextLine();
		System.out.println(reverseSentence(st));
		sc.close();
	}

	private static String reverseSentence(String st) {
		String stn="";
		char[] ch=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			int j=i;
			while(i>=0 && ch[i]!=' '){
				i--;
				
			}
			int k=i+1;
			while(k<=j){
				stn=stn+ch[k];
				k++;
			}
			if(i>0){
				stn=stn+" ";
			}
		}
		return stn;
	}
	
	
}
