package raghusir.array.abstracts;

public class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	void printInfo() {
		System.out.println("Circle: radius= "+radius);
	}

}
