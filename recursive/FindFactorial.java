package raghusir.recursive;

public class FindFactorial {

	public static void main(String[] args) {

	}
	
	static int fact(int n){
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

}
