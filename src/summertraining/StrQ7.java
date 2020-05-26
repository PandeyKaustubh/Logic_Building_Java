package summertraining;
import java.util.Scanner;
public class StrQ7 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		String x = sc.next();
		if(x.equalsIgnoreCase("Monday"))
                    System.out.println("1st Day");
                
                else if(x.equalsIgnoreCase("Tuesday"))
                    System.out.println("2nd Day");
                
                else if(x.equalsIgnoreCase("Wednesday"))
                    System.out.println("3rd Day");
                
                else if(x.equalsIgnoreCase("Thursday"))
                    System.out.println("4th Day");
                
                else if(x.equalsIgnoreCase("Friday"))
                    System.out.println("5th Day");
                
                else if(x.equalsIgnoreCase("Saturday"))
                    System.out.println("6th Day");
                
                else if(x.equalsIgnoreCase("Sunday"))
                    System.out.println("7th Day");
                
		else
                    System.out.println("Invalid Input");
	}
}
