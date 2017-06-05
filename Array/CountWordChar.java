package raghusir.array;
import java.util.Scanner;
public class CountWordChar {
	public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        countChar(str);
        sc.close();    
    }
	
	static void countChar(String str){
		int digits=0;
        int vowels=0;
        int consonants=0;
        int symbols=0;
        int spaces=0;
		char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++) 
        { 
            if((int)ch[i]>=48 && (int)ch[i]<=57) 
                digits++;
            else if((int)ch[i]==32) 
                spaces++; 
            else if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' || ch[i]=='E' || ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
                vowels++;
            else if((int)ch[i]>=65&&(int)ch[i]<=90 ||(int)ch[i]>=97&&(int)ch[i]<=122)
                consonants++;
            else
                symbols++;
        }
 
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonants :"+consonants);
        System.out.println("Digits :"+digits);
        System.out.println("Spaces :"+spaces);
        System.out.println("Special characters :"+symbols);

	}


}

