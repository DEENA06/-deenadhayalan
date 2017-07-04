package guvi2;
	import java.util.Scanner;
public class Amstwo {
    public static void main(String[] args) 

    {

       int n, count = 0, a, b, c, sum = 0;

       System.out.print("Armstrong numbers ");
       Scanner s=new Scanner(System.in);
       int s1=s.nextInt();
       int s2=s.nextInt();
      for(int i = s1; i <= s2; i++)

       {

           n = i;

           while(n > 0)

           {

               b = n % 10;

               sum = sum + (b * b * b);

               n = n / 10;

           }

           if(sum == i)

           {

               System.out.print(i+" ");

           }

           sum = 0;

       }

   }
}
