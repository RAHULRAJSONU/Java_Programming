package raghusir;

public class CheckOddEvenByMethod {

	public static void main(String[] args) {
		CheckOddEvenByMethod coe=new CheckOddEvenByMethod();
		System.out.println(coe.isEven(90));
		System.out.println(coe.isOdd(90));
	}
	boolean isEven(int n){
		return n%2==0;
	}
	boolean isOdd(int n){
		return n%2!=0;
	}

}
