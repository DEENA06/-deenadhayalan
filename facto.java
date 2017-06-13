import java.util.Scanner;
class Simple {
public static void main(String[] args) {
System.out.println("enter the number");
       int n;
       int num = 1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
       for (int i = 1; i <= n; i++) {
           num = num * i;
       }
       System.out.println("The factorial of  is " + num);
   }
}