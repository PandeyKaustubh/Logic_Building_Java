
package summertraining;
import java.util.Scanner;
public class StrQ13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1=x.nextLine();
        System.out.println("Enter 2nd String");
        String s2=x.nextLine();
       int res = s1.compareTo(s2);
       if(res>0)
       {
           System.out.println("String "+"["+s1+"]"+" will come later in lexicographic order !");
       }
       else if(res<0)
       {
           System.out.println("String "+"["+s2+"]"+" will come later in lexicographic order !");
       }
       else
       {
           System.out.println("Strings are equal and will together in lexicographic order !");
       }
       
    }
    
}
