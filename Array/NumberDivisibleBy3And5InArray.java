package raghusir.assignment.array;

public class NumberDivisibleBy3And5InArray {
	public static void main(String[] args) {
		int[] arr={5,89,45,65,75,25,30};
		int res=checkDiv(arr);
		System.out.println(res);
	}
	
	static int checkDiv(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0 && arr[i]%5==0){
				count++;
			}
		}
		return count;
	}
}
