package raghusir;

public class SimpleInterest {

	public static void main(String[] args) {
		SimpleInterest si=new SimpleInterest();
		System.out.println(si.calSimpleInt(1000, 1.5, 10));
	}
	
	double calSimpleInt(double p,double t,double r){
		return (p*t*r)/100;
	}

}
