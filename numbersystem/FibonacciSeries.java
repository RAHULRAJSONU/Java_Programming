package raghusir.assignment;

public class FibonacciSeries {
	public static void main(String args[])  
	{    
	  FibonacciSeries fs=new FibonacciSeries();
	  fs.PrintFibonacciWithin(50);
	  
	}
	void PrintFibonacci(int n){
		int n1=0,n2=1,n3=0;    
		 while(n>0)//loop starts from 2 because 0 and 1 are already printed    
		 {   
		  System.out.print(" "+n1);
		  n3=n1+n2;    
		  n1=n2;    
		  n2=n3; 
		  n--;
		 }   
	}
	
	void PrintFibonacciWithin(int n){
		int n1=0,n2=1,n3=0;    
		 while(n1<=n)//loop starts from 2 because 0 and 1 are already printed    
		 {   
		  System.out.print(" "+n1);
		  n3=n1+n2;    
		  n1=n2;    
		  n2=n3; 		  
		 }   
	}
}
  
 