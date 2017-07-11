package deena;
import java.util.Scanner;
public class str {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip1=in.nextLine();
		String ip2=in.nextLine();
		int len=ip1.length();
		int len1=ip2.length();
		if(len==len1) {
			System.out.println(ip1+ip2);
		}else if((len>2 )||(len1>2)) {
			String str=ip1.substring(len-2);
			String str1=ip2.substring(len1-2);
			System.out.println(str+str1);



		}
		



	}

}
