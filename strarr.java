package deena;
import java.util.Arrays;
import java.util.Scanner;
public class strarr {
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner s=new Scanner(System.in);
	    String s1=s.next();
	       int n=s1.length();
	       int k=s.nextInt(); 
	      int a[]=new int[n];
	       for(int i=0;i<n;i++)
	           {
	           a[i]=s1.charAt(i)-48;
	       }
	       Arrays.sort(a);
	       for(int i=0;i<n-k;i++)
	           System.out.print(a[i]);
	   }
	


}
