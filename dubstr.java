package deena;
import java.util.Scanner;
public class dubstr {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner in= new Scanner(System.in);
		String str=in.nextLine();
		   char h = 0;
		   String s2="";
		   for(int i=0;i<str.length();i++)
		   {
		       h=str.charAt(i);
	           if(h!=' ')
		       {
		           s2=s2+h;
		           str=str.replace(h, ' ');
		       }
		   }
		        System.out.println("the string is:"+s2);
	}

}
