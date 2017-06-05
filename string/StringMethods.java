package stringfull;

public class StringMethods {
	public static void main(String[] args) {
		String s="Rahul";
		System.out.println(s.toString());
		System.out.println("Value of S= "+s);
		char s1=s.charAt(2);
		System.out.println("character return after 'charAt()' method= "+s1);
		boolean s2=s.equalsIgnoreCase("rahul");		
		System.out.println("value returned after 'equalsIgnoreCase('rahul')'= "+s2);
		System.out.println("value returned after 'length()'= "+s.length());
		System.out.println("value returned after 'substring(1,3)'= "+s.substring(1, 3));
		s=s.concat(" Raj");
		System.out.println("Value of S after 'concat()'= "+s);
		s=s.replace('R', 'r');
		System.out.println("Value of S after 'replace()'= "+s);
		s=s.toLowerCase();
		System.out.println("Value of S after 'toLowerCase()'= "+s);
		System.out.println("value returned after 'toUpeercase()'= "+s.toUpperCase());
		System.out.println("value returned after 'length()'= "+s.trim());
		
	}	

}
