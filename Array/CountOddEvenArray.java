package raghusir.array;

public class CountOddEvenArray {
	public static void main(String[] args) {
		int[] a={10,3,5,4,9,8,3,16};
		countOE(a);
	}

	private static void countOE(int[] a) {
		int oc=0,ec=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				ec++;
			}else{
				oc++;
			}
		}
		System.out.println("total odd number : "+oc);
		System.out.println("total even number : "+ec);
	}
}
