package raghusir.array.abstracts;

public class Ractangle extends Shape {
	double length,width;
	public Ractangle(double length,double width) {
		this.length=length;
		this.width=width;
	}

	@Override
	double getArea() {
		return length*width;
	}

	@Override
	void printInfo() {
		System.out.println("Ractangle : length= "+length+" width= "+width);
	}

}
