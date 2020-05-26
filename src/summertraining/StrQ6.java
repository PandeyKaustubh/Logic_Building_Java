package summertraining;
import java.util.Scanner;
public class StrQ6 {
    public static void main(String[] args) {
	    Scanner x = new Scanner (System.in);
	    System.out.println("Enter 1st String");
	    String s1=x.nextLine();
            System.out.println("Enter 2nd String");
	    String s2=x.nextLine();
            System.out.println(s1==s2); //compares references not values thus in this case always False .
            System.out.println(s1.equals(s2)); //compares the string to the specified object.
            System.out.println(s1.compareTo(s2)); // compares values lexicographically and returns an integer value .
            System.out.println(s1.equalsIgnoreCase(s2));// compares the String to another string, ignoring case.
            
	}
}