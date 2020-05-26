package summertraining;
import java.util.Scanner;
public class StrQ10 {
    public static void main(String[] args) 
    {    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String f_name = sc.nextLine().toUpperCase();
		System.out.println("Enter Last Name");
		String l_name = sc.nextLine().toUpperCase();
		
		String res=f_name.charAt(f_name.length()-1)+" "+l_name;
		System.out.println(res);
	}
    
}
