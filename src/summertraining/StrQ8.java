package summertraining;
import java.util.Scanner;
public class StrQ8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String x = sc.nextLine();
		String s="";
		x=x+" ";
		for (int i=0;i<x.length();i++)
		{
		    if(x.charAt(i)!=' ')
		    {
		        if(x.charAt(i)>=65 && x.charAt(i)<=90)
		           s=s+(char)(x.charAt(i)+32);
		            
		        else if(x.charAt(i)>=97 && x.charAt(i)<=123)
		            s=s+(char)(x.charAt(i)-32);
                        
		        else
		            s=s+x.charAt(i);
		    }
		    else
		        s=s+" ";
		}
		System.out.println("Swapped Case String is: "+s);
	}
    
}
