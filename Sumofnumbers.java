package guvi2;
import java.util.Scanner;
public class Sumofnumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int a=s.nextInt();
		for(int i=0;i<=a;++i){
			sum=sum+i;
			System.out.println(sum);
		}
	}

}
