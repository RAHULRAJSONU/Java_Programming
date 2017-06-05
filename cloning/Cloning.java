package durga.javalangpkg.clone;

public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c=new Cat(20);
		Dog d1=new Dog(c, 10);
		System.out.println(d1.c.j+"....."+d1.i);
		Dog d2=(Dog)d1.clone();
		d2.c.j=500;
		d2.i=600;
		System.out.println("orig... "+d1.c.j+"....."+d1.i);
		System.out.println(d2.c.j+"....."+d2.i);
	}
}
