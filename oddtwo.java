package guvi2;
import java.util.Scanner;
public class oddtwo {

	public static void main(String[] args) {
		System.out.println("min max range");
		Scanner in=new  Scanner(System.in);
		int m1=in.nextInt();
		int m2=in.nextInt();
		for(int i=m1;i<=m2;i++){
			if(i%2!=0){
			int n=i;
			if(n==i){
			for(int j=n;;j--){
			System.out.println(j);
			break;
			}
			}
			}
		}
	}

}
