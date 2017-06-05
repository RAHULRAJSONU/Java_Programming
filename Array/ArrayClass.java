package raghusir.array;

public class ArrayClass {
	public static void main(String[] args) {
		int ar[]={10,25,6,5,89};
		double ab[]={10.02,15.26,56.40,3.0};
		printIntArr(ar);
		System.out.println("-------------------------");
		printDbArr(ab);
	}

	private static void printIntArr(int[] ar) {
		for(int i=0;i<ar.length;i++){
			System.out.println(i+"---->"+ar[i]);
		}
	}
	
	private static void printDbArr(double[] ar) {
		for(int i=0;i<ar.length;i++){
			System.out.println(i+"---->"+ar[i]);
		}
	}
}
