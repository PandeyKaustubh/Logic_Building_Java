package summertraining;
import java.util.Scanner;
public class StrQ3 {
    public static void main(String[] args) {
	Scanner x = new Scanner (System.in);
	int c=0;
	    System.out.println("Enter any String");
	    String s = x.nextLine();
	    for (int i=0;i<s.length();i++)
	    {
	     if( ((int)s.charAt(i)>=65) && ((int)s.charAt(i)<=90) )
	        c+=1 ;
	    }
		System.out.println("Number of Caplital letters in the String is/are: "+c);
	}
    
    
}
