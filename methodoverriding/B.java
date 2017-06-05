package raghusir.methodoverriding;

class B extends A{
	public static void main(String[] args) {
		B b=new B();
		b.disp();
	}
	@Override
	void disp() {
		System.out.println("Class B method");
	}
}
