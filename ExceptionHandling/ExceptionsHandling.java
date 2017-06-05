package durga.exception_handling;

public class ExceptionsHandling {
	public static void main(String[] args) {
		int x=5,z=0;
		int[] a={1,2,3,4};
		try{
			z=x/z;
			for(int i=0;i<6;i++){
				System.out.println(a[i]);
			}
		}catch(ArithmeticException e){
			System.out.println("Can not divide by zero "+e);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block says- Bye.");
		}
		
		
	}

}
