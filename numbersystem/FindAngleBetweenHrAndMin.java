package raghusir;

public class FindAngleBetweenHrAndMin {
	public static void main(String[] args) {
		FindAngleBetweenHrAndMin fa =new FindAngleBetweenHrAndMin();
		fa.findAngle(9, 25);
	}
	void findAngle(int hour, int minute){
		double hrAngle=((hour*30)+(minute*0.5));
		double minAngle=(minute*6);
		double angle=0;
		if(hrAngle>minAngle){
			angle=hrAngle-minAngle;
		}else{
			angle = minAngle-hrAngle;
		}
		
		if(angle>180){
			angle=360-angle;			
		}
		System.out.println("Least angle between hour "+hour+" and minute "+minute+" is "+angle);
		System.out.println("Least angle between hour "+hour+" and minute "+minute+" is "+(360-angle));
		
	}
}
