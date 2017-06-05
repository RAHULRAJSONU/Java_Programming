package raghusir.methodoverriding;

public class Parent {
	
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.show();
		Parent p2=new Child();
		p2.show();
		Parent p3=new GrandChild();
		p3.show();
		//GrandChild gc=new Child();
	}
	void show(){
		System.out.println("parent class");
	}
}

class Child extends Parent{
	@Override
	void show() {
		System.out.println("child class");
	}
}

class GrandChild extends Parent{
	@Override
	void show() {
		System.out.println("grand Child class");
	}
}
