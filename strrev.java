package deena;
import java.util.Scanner;
public class strrev {

	public static void main(String[] args) {
	    System.out.println("enter the words");
	    Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    String str1=new StringBuffer(str).reverse().toString();
	    System.out.println(str1);

	}

}
