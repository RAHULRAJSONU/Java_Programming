package raghusir.array;

import java.util.Scanner;

public class ReverseWordInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you sentence....");
		String sent=sc.nextLine();
		System.out.println(reverseWord(sent));
		sc.close();
	}

	private static String reverseWord(String st) {
		String stn=" ";
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			
			int l=i;
			while(i<ch.length && ch[i]!=' '){
				i++;
			}
			int k=i-1;
			while(k>=l){
				stn=stn+ch[k];
				k--;
			}
			
			if(i<ch.length){
				stn=stn+" ";
			}
			
		}
		return stn;
	}
}
