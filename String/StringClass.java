package durga.javalangpkg.string;

public class StringClass {
	/*
	 * check string equals() vs ==
	 */
	public static void main(String[] args) {
		String s1= new String("rahul");
		String s2=new String ("rahul");
		//byte[] i={1,2,4,5};
		//String s3=new String(i);
		System.out.println(s1==s2+" equals();-returns ");
		System.out.println("== returns- "+s1.equals(s2));
	}
}
