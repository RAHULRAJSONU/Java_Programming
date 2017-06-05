package raghusir.array;

import java.util.Scanner;

public class CountWord {
	static int i,c=0,res;
    
    public static void main (String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the sentence");
    	String st=sc.nextLine();
    	System.out.println("Total Word : "+CountWord.wordCount(st));
    	sc.close();
    }
    
    static int wordCount(String s)
    {
        char ch[]= new char[s.length()]; 
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
        }
        return c;
    }
    
}

