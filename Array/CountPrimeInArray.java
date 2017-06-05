package raghusir.assignment.array;

public class CountPrimeInArray {
	public static void main(String[] args) {
		int[] ar={1,2,3,4,5,6,9,8,7,56,89,36,78};
		int c=countPrime(ar);
		System.out.println("Total Prime Number: "+c);
	}
	
	static int countPrime(int[] arr){
		int num=0;
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])){
				num++;
			}
		}
		return num;
	}
	static boolean isPrime(int n){
		int flag=0;
		int m=n/2;
		for(int i=2;i<=m;i++){
			if(n%i==0){
				flag++;
			}
		}
		return flag==0;
	}
}
