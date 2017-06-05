package raghusir;

public class NumberDivBy {
	public static void main(String[] args) {
		NumberDivBy nd=new NumberDivBy();
		nd.findDivByNum(100, 3, 5);
	}
	void findDivByNum(int nTill, int divBy, int divBy2){
		for(int i=0;i<=nTill;i=i+divBy2){
			if(i%divBy==0 && i%divBy2==0){
				System.out.println(i);
			}
		}
	}
}
