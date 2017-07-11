package deena;
import java.util.Scanner;
public class str1 {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String str1=new StringBuffer(str).reverse().toString();
		
		int n=str1.length();
		for(int i=0;i<n;i++) {
			char str2=str1.charAt(i);
			System.out.print(str2+"-");
			
		}
		

	}

}
