package durga.javalangpkg.clone;

public class Dog implements Cloneable{
	Cat c;
	int i;
	Dog(Cat c,int i){
		this.c=c;
		this.i=i;
	}
	/*
	 * DeepCloning
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1=new Cat(c.j);
		Dog d=new Dog(c1,i);
		return d;
	}
}
