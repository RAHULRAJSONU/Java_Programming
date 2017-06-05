package raghusir.array;

public class CalMeanOfArray {
	public static void main(String[] args) {
		int[] arr={12,54,78,02,15,36,9,3};
		double val=calMean(arr);
		System.out.println(val );
	}

	private static double calMean(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return (double)sum/arr.length;
	}
}
