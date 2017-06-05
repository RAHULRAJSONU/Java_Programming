package raghusir.pattern;

public class DrawStar {
	public static void main(String[] args) {
		//drawStar();
		//System.out.println();
		//drawStar6Times6Line();
		//printNumber6Times6Line();
		//printNumber();
		//printOddNumber();
		//printNumber1();
		//printNumber2();
		//printNumber3();
	}
	/*
	 *   ****
	 *   ****
	 *   ****
	 *   ****
	 */
	static void drawStar(){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	/*
	 *   ******
	 *   ******
	 *   ******
	 *   ******
	 *   ******
	 *   ******
	 */
	static void drawStar6Times6Line(){
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	/*
	 * 111111
	 * 222222
	 * 333333
	 * 444444
	 * 555555
	 * 666666
	 */
	static void printNumber6Times6Line(){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
	}
	/*
	 *  11111
	 *  2222
	 *  333
	 *  44
	 *  5
	 */
	static void printNumber(){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
	}
	/*
	 *   *
	 *   ***
	 *   *****
	 *   *******
	 */
	static void printOddNumber(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=(2*i-1);j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	/*
	 *   1
	 *   10
	 *   101
	 *   1010
	 *   10101
	 */
	static void printNumber1(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
	/*
	 *   1
	 *   2 3
	 *   4 5 6
	 *   7 8 9 10
	 *   11 12 13 14 15
	 */
	static void printNumber2(){
		int l=1;
		for(int i=0;i<=5;i++){
			for(int j=1;j<=i;j++){				
				System.out.print(" "+l+" ");
				l++;
			}
			
			System.out.println();
		}
	}
	/*
	 *   1
	 *   23
	 *   345
	 *   4567
	 *   56789
	 */
	static void printNumber3(){
		
		for(int i=1;i<=5;i++){
			int l=i;
			for(int j=1;j<=i;j++){				
				System.out.print(l);
				l++;
			}
			
			System.out.println();
		}
	}
}
