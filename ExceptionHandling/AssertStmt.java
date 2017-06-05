package durga.exception_handling;

public class AssertStmt {
	public static void main(String[] args) {
		int x=10;
		assert(x>10):"x must be 11 here";
		System.out.println(x);
	}
}
