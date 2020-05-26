package summertraining;
import java.util.Scanner;
public class StrQ2 {
    public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("Enter First Name");
	String f_name=x.next();
	System.out.println("Enter Middle Name");
	String m_name=x.next();
	System.out.println("Enter Last Name");
	String l_name=x.next();
		
	String s_name=f_name.charAt(0)+"."+m_name.charAt(0)+"."+l_name.charAt(0);
		
	System.out.println(s_name);
	}
}
