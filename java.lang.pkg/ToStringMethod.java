package durga.javalangpkg;

public class ToStringMethod {
	String name;
	int rollNumber;
	public ToStringMethod(String name, int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public String toString(){
		return "name: "+name+"___"+" RollNumber:"+rollNumber;
	}
	/*
	 * without overriding the to string method
	 * the output of 
	 * System.out.println(ts)=durga.javalangpkg.ToStringClass@15db9742
	 * System.out.println(ts2)=durga.javalangpkg.ToStringClass@6d06d69c
	 */
	public static void main(String[] args) {
		ToStringMethod ts=new ToStringMethod("Rahul", 130);
		ToStringMethod ts2=new ToStringMethod("Raj", 120);		
		System.out.println(ts);
		System.out.println(ts2);
	}
	
}
