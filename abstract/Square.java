package raghusir.array.abstracts;

public class Square extends Shape {
	double side;
	Square(double side){
		this.side=side;
	}

	@Override
	double getArea() {
		return side*side;
	}

	@Override
	void printInfo() {
		System.out.println("Square : side= "+side);
	}

}
