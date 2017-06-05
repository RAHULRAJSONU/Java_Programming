package durga.javalangpkg.string.wrapper_class;

public class AutoBoxingAndUnboxing {
	static Integer i=100; //AutoBoxing
	public static void main(String[] args) {		
		int m=i;//AutoUnBoxing
		method(m);//AutoBoxing
		Integer x=190;
		Integer y=190;
		
		System.out.println("x: "+x+" Y: "+y);
		System.out.println(x==y);//false
	}
	static void method(Integer k){
		int m=k;//AutoUnBoxing
		System.out.println(m);
	}
}
