package raghusir.varargs;

public class VarArgs {

	public static void main(String[] args) {
			
	}
	int sum(int...x){
		int s=0;
		for(int i=0;i<x.length;i++)
		{
			s=s+x[i];
		}
		return s;		
	}
	int s;

}
