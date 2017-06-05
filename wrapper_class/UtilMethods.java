package durga.javalangpkg.string.wrapper_class;

public class UtilMethods {
	public static void main(String[] args) {
		/*
		 * valueOf();
		 * Form-1
		 */
		Integer i=Integer.valueOf("10");
		System.out.println(i);
		Boolean b= Boolean.valueOf("rahul");
		System.out.println(b);
		/*
		 * valueOf();
		 * Form-2
		 */
		Integer i1=Integer.valueOf("1100",2);
		System.out.println(i1);
		Integer c=Integer.valueOf('c');
		System.out.println(c);
		/**********************************
		 * xxxValue();
		 * 
		 */
		Integer i3=new Integer(130);
		System.out.println(i3.hashCode());
		/*****
		 * charValue();
		 */
		
	}
	
	
}
