package summertraining;
import java.util.Scanner;
public class StrQ4 {
    public static void main(String[] args) {
	    Scanner x = new Scanner (System.in);
	    int count=0;
	    System.out.println("Enter any String");
	    String s=x.nextLine().toUpperCase();
	    for (int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
	        count+=1;
	        
	    }
		System.out.println("Number of Vowels in the String is/are: "+count);
	}
    
}
