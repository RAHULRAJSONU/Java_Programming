package raghusir.conversion;

public class HexToDec {

	public static void main(String[] args) {
		HexToDec htd=new HexToDec();
		System.out.println(htd.HexaToDecimal("A2b8"));
	}
	
	int HexaToDecimal(String st){
		int c=0,sum=0;
		for(int i=st.length()-1;i>=0;i--){
			char ct=st.charAt(i);
			if(ct>=48 && ct<=57){
				sum=sum+(ct-48)*power(16,c);
			}else if(ct>=97 && ct<=122){
				sum=sum+(ct-87)*power(16,c);
			}else{
				sum=sum+(ct-55)*power(16,c);
			}
			c++;
		}
		return sum;
	}
	
	private int power(int i, int p) {
		int pow=1;
		while(p>0){
			pow=pow*i;
			p--;
		}
		return pow;
	}


}
