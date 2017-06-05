package raghusir.array;

public class FindBiggestInArray {
	public static void main(String[] args) {
		int[] ar={1,2,5,4,2};
		//System.out.println(getBiggest(ar));
		//System.out.println(nThBiggestElem(ar, 3));
		reverseArray(ar);
		printArrat(ar);
	}
	
	static void printArrat(int[] ar){
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}
	static int getBiggest(int[] a){
		int big=a[0];
		for(int i=1;i<a.length;i++){
			if(big<a[i]){
				big=a[i];
			}
		}
		return big;
	}
	
	static int nThBiggestElem(int[] ar, int n){
		for(int i=0;i<ar.length;i++){
			int count=0;
			for(int j=0;j<ar.length;j++){
				if(ar[j]>ar[i]){
					count++;
				}
			}
			if(count==n-1){
				return ar[i];
			}
		}
		System.out.println(n+"th biggest val not available");
		return 0;
	}
	
	static void reverseArray(int[] ar){
		for(int i=0;i<ar.length/2;i++){
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
	}
	
	static void swapContineous(int[] ar){
		for(int i=0;i<ar.length-1;i+=2){
			int t=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=t;
		}
	}
}
