package raghusir.methodoverriding;

public class SuperDot {
	public static void main(String[] args) {
		B1 b=new B1();
		b.disp();
		System.out.println("-------------------");
		A1 a=new B1();
		a.disp();
	}
}
class A1{
	void disp(){
		System.out.println("Hii");
	}
}
class B1 extends A1{
	@Override
	void disp() {
		super.disp();
		System.out.println("How are you");
	}
}