package raghusir;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		PrimitiveTypeCasting ptc=new PrimitiveTypeCasting();
		ptc.typeCastingResult((int)74.00);
		ptc.typeCastingResult('A');
		ptc.typeCastingResult((int)9255511109L);
		ptc.typeCastingResult((int)48.266589F);
		System.out.println("-----");
		ptc.typeCastingResultWithChar((char)68);
		ptc.typeCastingResultWithChar((char)59);
		ptc.typeCastingResultWithChar((char)32);
		System.out.println("-----");
		ptc.typeCastingDouble(89);
	}
	void typeCastingResult(int a){
		System.out.println(a);
	}
	void typeCastingResultWithChar(char a){
		System.out.println(a);
	}
	void typeCastingDouble(double d){
		System.out.println(d);
	}
	
}
