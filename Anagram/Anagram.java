package raghusir.anagram;

public class Anagram {
	public String removeSpace(String st){
		char[] ch=st.toCharArray();
		st="";
		for(int i=0; i<ch.length;i++){
			if(ch[i]!=' '){
				st=st+ch[i];
			}			
		}
		return st;
	}
	
	public boolean compareString(String st1, String st2){
		return st1.length()==st2.length();
	}
	
	public String toLower(String st){
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A' && ch[i]<='Z'){
				st=st+(char)(ch[i]+32);
			}else{
				st=st+ch[i];
			}
		}
		return st;		
	}
	
	public int[] countString(String st){
		int ct[]=new int[128];
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			ct[ch[i]]++;
		}
		return ct;
	}
	
	public boolean compareStringCount(String st1, String st2){
		int c1[] = countString(st1);
		int c2[] = countString(st2);
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i] != c2[i]){
				return false;				
			}
		}
		return true;
			
	}
}
