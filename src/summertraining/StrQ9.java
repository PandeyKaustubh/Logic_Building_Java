package summertraining;
import java.util.Scanner;
public class StrQ9 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String/Word");
		String x = sc.nextLine().toUpperCase();
		String s="";
		for (int i=0;i<x.length();i++)
		{
		    if(x.charAt(i)!=' ')
		        s=x.charAt(i)+s;
		    else
		        s=" "+s;
		}
		if(x.equals(s))
		    System.out.println("Palindrome");
                else
                    System.out.println("Not a Palindrome");
	}
    
}
