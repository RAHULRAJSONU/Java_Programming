package raghusir.pattern;

import java.lang.reflect.Method;

public class GetMethod {
	public static void main(String[] args) {
		DrawStar ds=new DrawStar();
		Class c=ds.getClass();
		System.out.println("Name of the class: "+ ds.getClass());
		Method[] m=c.getDeclaredMethods();
		int count=1;
		for(Method name:m){
			System.out.println(count+" :- "+name);
			count++;
		}
	}
}
