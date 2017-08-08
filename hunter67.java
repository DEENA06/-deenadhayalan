import java.util.*;
public class hunter67 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String[] s3=s1.split("#");
		String[] s4=s2.split("#");
		String str=String.valueOf(s3[0]);
		String str1=String.valueOf(s4[0]);
		int a=Integer.parseInt(s3[1]);		
		int b=Integer.parseInt(s3[2]);
		int c=Integer.parseInt(s4[3]);
		int a1=Integer.parseInt(s4[1]);
		int b1=Integer.parseInt(s4[2]);
		int c1=Integer.parseInt(s4[3]);
		int sum=0,sum1=0;
		sum=a+b+c;
		sum1=a1+b1+c1;
		if(sum>sum1) {
			System.out.println(str);
		}
		else {
			System.out.println(str1);
		}
		
		
		

	}

}
