package raghusir.assignment;

public class CalculatePower {

	public static void main(String[] args) {
		System.out.println(calPower(5, 9));
	}
	
	static int calPower(int number, int power){
		int p=1;
		while(power>0){
			p=p*number;
			power--;
		}
		return p;
	}

}
