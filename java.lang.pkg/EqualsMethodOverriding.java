package durga.javalangpkg;

public class EqualsMethodOverriding {
	String name;
	int rollNumber;
	public EqualsMethodOverriding(String name, int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	/*
	 * overriding equals method to
	 *  get content comparison
	 */
	@Override
	public boolean equals(Object obj) {
		boolean rs=false;
		if(obj==this){
			return true;
		}else{
			if(obj instanceof EqualsMethodOverriding){
				EqualsMethodOverriding s=(EqualsMethodOverriding)obj;
				if(this.name.equals(s.name) && this.rollNumber==s.rollNumber){
					rs= true;
				}else{
					rs= false;
				}
			}
			
		}
		return rs;
		
	}
	/*
	 * before overriding the equals method 
	 * following statements give
	 *  System.out.println(s1.equals(s2))//false
		System.out.println(s1.equals(s3))//false
		System.out.println(s1.equals(s4))//true
		System.out.println(s1.equals("Singh"))//false
		System.out.println(s1.equals(null))//false
	 */
	public static void main(String[] args) {
		EqualsMethodOverriding s1=new EqualsMethodOverriding("Rahul", 101);
		EqualsMethodOverriding s2=new EqualsMethodOverriding("Raj", 102);
		EqualsMethodOverriding s3=new EqualsMethodOverriding("Rahul", 101);
		EqualsMethodOverriding s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Singh"));
		System.out.println(s1.equals(null));
	}
}
