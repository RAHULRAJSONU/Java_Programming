package durga.javalangpkg.string;

public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(100000000);
		System.out.println(sb.capacity());
		sb=new StringBuilder("rahul");
		System.out.println(sb.capacity());
		sb.append(10);
		System.out.println(sb);
		sb.insert(2, 1.25);
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
		sb.deleteCharAt(6);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
	}
	

}
