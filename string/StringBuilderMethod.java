package stringfull;

public class StringBuilderMethod {	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Rahul ");
		System.out.println("Value of sb= "+sb);
		sb.append("Raj");
		System.out.println("Value of sb after appending Raj= "+sb);
		sb.append(9);
		System.out.println("Value of sb after appending 9= "+sb);
		sb.delete(2, 4);
		System.out.println("Value of sb after delete() = "+sb);
		sb.insert(2, "h");
		sb.insert(3, "u");
		System.out.println("Value of sb after insert h at 2= "+sb);
		sb.reverse();
		System.out.println("Value of sb after reverse() = "+sb);
		sb.reverse();
		
	}
}
