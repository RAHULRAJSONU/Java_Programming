package durga.javalangpkg;

public class HashCodeOverriding {
	int i;
	public HashCodeOverriding(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {		
		return i;
	}
	/*
	 * after overriding the hashCode method
	 * System.out.println(hso)=durga.javalangpkg.HashCodeOverriding@a
	 * System.out.println(hso1)=durga.javalangpkg.HashCodeOverriding@64
	 * becoz toHexString of 10 is a and
	 * toHexString of 100 is 64
	 */
	public static void main(String[] args) {
		HashCodeOverriding hso=new HashCodeOverriding(10);
		HashCodeOverriding hso1=new HashCodeOverriding(100);
		System.out.println(hso);
		System.out.println(hso1);
	}
	
}
