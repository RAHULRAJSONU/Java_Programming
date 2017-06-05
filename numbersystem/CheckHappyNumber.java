package raghusir.assignment;

public class CheckHappyNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<10000;i++){			
			if(isHappy(i)){
				System.out.println(count+"). "+"Yeah!..: "+i+" is happy number :-)");	
				count++;
			}
		}
		//System.out.println(isHappy(97));
	}
	
	static boolean isHappy(int number){			
		while(number>9){
			int sum=0;
			while(number!=0){
				int r=number%10;
				sum=sum+(r*r);
				number=number/10;
			}
			number=sum;
		}
		return number==1||number==7;		
	}

}
