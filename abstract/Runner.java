package raghusir.array.abstracts;

public class Runner {

	public static void main(String[] args) {
		Shape[] s={new Circle(4.5),new Ractangle(25, 12),new Square(4.9),new Square(56)};
		Shape big=s[0];
		for(int i=1;i<s.length;i++){
			if(big.getArea()<s[i].getArea()){
				big=s[i];
			}
		}
		big.printInfo();
		System.out.println("Biggest Shape: "+big.getArea());
	}

}
