import java.util.Scanner;
class Simple{
public static void main(String args[]){
long n;
int count=0;
System.out.println("enter the integer");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0){
n/=10;
++count;
}
System.out.println(+count);
}
}