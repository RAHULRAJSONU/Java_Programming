package raghusir.pattern;

public class AssignmentDraw {
	public static void main(String[] args) {
		System.out.println("1).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern1();
		System.out.println("");
		System.out.println("2).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern2();
		System.out.println("");
		System.out.println("3).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern3();
		System.out.println("");
		System.out.println("4).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern4();
		System.out.println("");
		System.out.println("5).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern5();
		System.out.println("");
		System.out.println("6).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern6();
		System.out.println("");
		System.out.println("7).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern7();
		System.out.println("");
		System.out.println("8).");
		System.out.println("------------------------------");
		System.out.println("");
		pattern8();
	}
	/*
	 * 1
	 * 01
	 * 010
	 * 1010
	 * 10101
	 * 010101
	 */
	static void pattern1(){
		int s=1;
		for(int i=1;i<=5;i++){			
			for(int j=1;j<=i;j++){					
				System.out.print(" "+(s%2)+" ");
				s++;
			}
			System.out.println("");
		}
	}
	/*
	 * 1
	 * 333
	 * 55555
	 * 7777777
	 * 999999999
	 */
	static void pattern2(){
		for(int i=1; i<6;i++){
			for(int j=i;j<=i*3-2;j++){
				System.out.print(" "+(i*2-1)+" ");
			}
			System.out.println("");
		}
	}
	/*
	 * 1
	 * 00
	 * 111
	 * 0000
	 * 11111
	 */
	static void pattern3(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+(i%2)+" ");
			}
			System.out.println("");
		}
	}
	/*
	 * 11111
	 * 0000
	 * 111
	 * 00
	 * 1
	 */
	static void pattern4(){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" "+(i%2)+" ");
			}
			System.out.println("");
		}
	}
	/*
	 * 01010
	 * 0101
	 * 010
	 * 01
	 * 0
	 */
	static void pattern5(){		
		for(int i=1;i<=5;i++){
			int s=0;
			for(int j=5;j>=i;j--){
				System.out.print(" "+(s%2)+" ");
				s++;
			}
			System.out.println("");
		}
	}
	/*
	 * 10101
	 * 1010
	 * 101
	 * 10
	 * 1
	 */
	static void pattern6(){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" "+(j%2)+" ");
			}
			System.out.println("");
		}
	}
	/*
	 * 54321
	 * 5432
	 * 543
	 * 54
	 * 5
	 */
	static void pattern7(){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" "+j+" ");
			}
			System.out.println("");
		}
	}
	/*
	 * 10 9 8 7
	 * 6 5 4
	 * 3 2
	 * 1
	 */
	static void pattern8(){
		int l=10;
		for(int i=1;i<5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" "+l+" ");
				l--;
			}
			System.out.println("");
		}
	}

}
