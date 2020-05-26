package summertraining;
import java.util.Scanner;
public class StrQ11 {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = sc.next().toLowerCase();
		String res=""; int index=0,flag=0;
		for(int i=0;i<word.length();i++)
		{
		    if(word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='o'||word.charAt(i)=='i'||word.charAt(i)=='u')
		    {
		        index=i;
		        flag=1;
		        break;
		    }
		}
		if(flag==1)
		{   
		    res=word.substring(index)+word.substring(0,index)+"ay";
		    System.out.println("Piglatin Form: "+res);
		}
		else
		    System.out.println("Can't be converted into Piglatin Form !");
	}
    
}
