package raghusir.assignment.array;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr={0,9,1,2,3,4,5,6,7,8,9};
		int[] r=reverseArray(arr);
		for(int i=0; i<r.length;i++){
		System.out.println(r[i]);
		}
	}
	
	private static int[] reverseArray(int[] arr) {
		int c=arr.length-1;
		for(int i=0;i<arr.length/2;i++){			
			int s=arr[i];
			int e=arr[c];
			arr[i]=e;
			arr[c]=s;
			c--;
		}
		return arr;
	}
}
