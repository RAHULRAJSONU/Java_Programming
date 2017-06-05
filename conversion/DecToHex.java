package raghusir.conversion;

public class DecToHex {

	public static void main(String[] args) {
		DecToHex dth=new DecToHex();
		System.out.println(dth.decimalToHex(41656));
	}
	
	String decimalToHex(int n){
		String hex="";
		while(n>0){
			int r=n%16;
			if(r<10){
				hex=r+hex;
			}else{
				hex=(char)(r+55)+hex;
			}
			n=n/16;
			
		}
		return hex;
	}

}
