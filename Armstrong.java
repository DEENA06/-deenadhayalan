package guvi2;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int c=0,a,temp;
		int n = 0;
		System.out.println("enter the number");
		temp=n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n>0){
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}if(temp==n){
			System.out.println("Amstrong number");
		}else{
			System.out.println("not Amstrong number");
		}

	}

}
