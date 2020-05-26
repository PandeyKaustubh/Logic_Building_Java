package summertraining;
import java.util.Scanner;
public class StrQ16 {
    public static void main (String[]args)
  {
    Scanner x = new Scanner(System.in);
    String arr[]=new String[5];
    System.out.println("Enter 5 Names");
    for(int i=0;i<5;i++)
    {   String s=x.nextLine();
        arr[i]=s;
    }
    System.out.println("Names starting with vowles is/are-");
    for(int j=0;j<arr.length;j++)
    {   String s1=arr[j];
        s1=s1.toUpperCase();
        if(s1.charAt(0)=='A'||s1.charAt(0)=='E'||s1.charAt(0)=='I'||s1.charAt(0)=='O'||s1.charAt(0)=='U')
        System.out.println(arr[j]);
        else
          continue;  
    }
   }   
}
