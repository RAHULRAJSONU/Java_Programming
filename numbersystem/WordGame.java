package raghusir.assignment;

public class WordGame {

	public static void main(String[] args) {
		String s="rahul raj sonu singh";
		System.out.println(reverseOddPositionWord(s));
	}
	public static String reverseOddPositionWord(String st){
		char[] ch=st.toCharArray();
		int wc=0;
		for(int i=0;i<ch.length;i++){
			if(i==0 && ch[i] !=' ' ||ch[i] !=' ' && ch[i-1]==' '){
				wc++;
				if(wc%2==0){
					int k=i;
					while(i+1<ch.length && ch[i+1] !=' '){
						i++;
					}
					int l=i-1;
					while(l>=k){
						st=st+ch[l];
						l--;
					}
				}
			}
		}
		return st;		
	}

}
