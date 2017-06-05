package raghusir.assignment.array;

public class AddStringWithoutConcat {

	public static void main(String[] args) {
		String s1="Rahul";
		String s2="Singh";
		String s3="Raj";
		System.out.println(concat(concat(s1, s3),s2));
		
	}
	
	static String concat(String st1, String st2){
		char[] rs=new char[st1.length()+st2.length()+1];
		int k=0;
		while(k<st1.length()){
			rs[k]=st1.charAt(k);
			k++;
		}
		int j=0;
		while(j<st2.length()){
			rs[k+1]=st2.charAt(j);
			k++;
			j++;
		}
		return new String(rs);
	}

}
