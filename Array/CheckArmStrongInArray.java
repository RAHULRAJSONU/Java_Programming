package raghusir.assignment.array;

public class CheckArmStrongInArray {
	public static void main(String[] args) {
		int[] arr={153,370,371,755,825};
		int r=armStrongInArray(arr);
		System.out.println(r);
	}
	
	static int armStrongInArray(int[] arr){
		int c=0;
		for(int i=0;i<arr.length;i++){
			if(isArmstrong(arr[i])){
				c++;
			}
		}
		return c;
	}
	static int calPower(int number, int power){
		int p=1;
		while(power>0){
			p=p*number;
			power--;
		}
		return p;
	}
	static int countDigit(int n){
		int c=0;
		while(n!=0){
			n=n/10;
			c++;
		}
		return c;
	}
	static boolean isArmstrong(int n){
		int res=0;
		int temp=n;
		while(n!=0){
			int nm=n%10;
			res+=calPower(nm, countDigit(temp));
			n=n/10;
		}
		return (res==temp);
	}
}
