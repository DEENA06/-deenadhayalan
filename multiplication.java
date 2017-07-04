package guvi2;
import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
		System.out.println("enter the num");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		for(int i=0;i<=10;i++){
			System.out.println(+i+"*" +x+"="+x*i);
		}

	}

}
