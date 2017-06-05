package raghusir;

public class MultiplicationTable {

	public static void main(String[] args) {
		MultiplicationTable mt=new MultiplicationTable();
		mt.multiplication(260);
	}
	void multiplication(int tableOf){
		int n=tableOf;
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+i*n);
		}
	}

}
