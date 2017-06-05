package raghusir.assignment;

public class InitCaps {

	public static void main(String[] args) {
		String st="rahul raj sonu";
		System.out.println(new String(applyInitCaps(st)));
	}
	public static char[] applyInitCaps(String st){
		char[] ch=st.toCharArray();
		for(int i=0; i<ch.length;i++){
			if(i==0 && ch[i] !=' ' ||ch[i] !=' ' && ch[i-1]==' '){
				ch[i]=(char)(ch[i]-32);
			}else if(ch[i]>='A' && ch[i]<='Z'){
				ch[i]=(char)(ch[i]+32);
			}
		}
		return ch;
	}

}
