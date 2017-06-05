package raghusir.array;

public class SumOfOddAndEven {

	public static void main(String[] args) {
		int[] ar={20,23,24,25,26,27,28};
		sum(ar);
	}
	
	static void sum(int[] ar){
		int so = 0,se = 0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]%2==0){
				se+=ar[i];
			}else{
				so+=ar[i];
			}
		}
		System.out.println("Total sum of odd :" + so);
		System.out.println("Total sum of even :" + se);
	}

}
