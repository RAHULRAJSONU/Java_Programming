package raghusir.assignment.array;

public class SpecialTwoDigitInArray {
	public static void main(String[] args) {
		int[] arr={10,45,25,99,87,55,65,40};
		int s=checkSpecialInArray(arr);
		System.out.println(s);
	}
	
	private static int checkSpecialInArray(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(checkSpecial(arr[i])){
				count++;
			}
		}
		return count;
	}

	static boolean checkSpecial(int number){
		int re=0;
		int t=number;
		if(number<10||number>99){
			return false;
		}else{
			while(number>=10){
				int n=number%10;
				int n2=number/10;
				re=(n*n2)+(n+n2);
				number=number/10;
			}
			return t==re;
		}
	}

}
