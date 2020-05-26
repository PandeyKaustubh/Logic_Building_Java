package summertraining;
import java.util.Scanner;
public class StrQ5 {
    public static void main(String[] args) {
	    Scanner x = new Scanner (System.in);
	    int c=0;
	    System.out.println("Enter any String");
	    String s=x.nextLine();
	    s=s+" ";
	    for (int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)!=' ')
	            continue;
	        else
	            c+=1;
	        
	    }
		System.out.println("Number of Words in the String is/are: "+c);
	}
}
