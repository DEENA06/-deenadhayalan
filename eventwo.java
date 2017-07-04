package guvi2;
import java.util.Scanner;
public class eventwo {

	public static void main(String[] args) {
		System.out.println("two intervals");
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt();
		int x2=in.nextInt();
		for(int i=x1;i<=x2;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		

	}

}
