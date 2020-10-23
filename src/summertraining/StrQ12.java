
package summertraining;
import java.util.Scanner;
import java.lang.String;
public class StrQ12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your full name !");
        String s1=x.nextLine().toLowerCase();
        String w="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
                w=w+s1.charAt(i);
            else
                break;
        }
        switch (w) {
            case "mr":
                System.out.println("Male");
                break;
            case "miss":
                System.out.println("Female");
                break;
            case "mrs":
                System.out.println("Married Female");
                break;
            case "kumari":
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
            
            
        
    }
    
}
