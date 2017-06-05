package raghusir.saterdayprog;

public class Factorial {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		System.out.println("factorial of "+i+" is "+findFactorial(i));
	}
	
	static int findFactorial(int n){
		int r=1;
		while(n!=0){
			r=r*n;
			n--;
		}
		return r;
	}
}
