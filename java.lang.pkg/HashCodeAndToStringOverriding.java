package durga.javalangpkg;

public class HashCodeAndToStringOverriding {
	int i;
	public HashCodeAndToStringOverriding(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {		
		return i;
	}
	/*
	 * after overriding of toString method 
	 * System.out.println(hso)=10
	 * System.out.println(hso1)=100
	 * becoz toString is overriden by our class
	 * hence hashCode method wont called
	 */
	@Override
	public String toString() {		
		return i+" ";
	}
	/*
	 * after overriding the hashCode method
	 * System.out.println(hso)=durga.javalangpkg.HashCodeAndToStringOverriding@a
	 * System.out.println(hso1)=durga.javalangpkg.HashCodeAndToStringOverriding@64
	 * becoz toHexString of 10 is a and
	 * toHexString of 100 is 64
	 */
	public static void main(String[] args) {
		HashCodeAndToStringOverriding hso=new HashCodeAndToStringOverriding(10);
		HashCodeAndToStringOverriding hso1=new HashCodeAndToStringOverriding(100);
		System.out.println(hso);
		System.out.println(hso1);
	}
}