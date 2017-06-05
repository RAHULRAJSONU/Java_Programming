package durga.javalangpkg;

import java.lang.reflect.Method;

public class GetClassMethod {
	public static void main(String[] args) {
		int count=0;
		String s=new String("Ram");
		Class c=s.getClass();
		System.out.println("Fully qualified class name : "+c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Method Details: ");
		for(Method m1:m){
			count++;
			System.out.println("Method ["+count+"] : "+m1+";");
		}
		System.out.println("Total Method Fount :"+count);
	}
}
