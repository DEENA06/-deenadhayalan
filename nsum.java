import java.util.Scanner;
class Simple{
public static void main(String args[]){
System.out.println("enter the number");
int n;
int sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
n=n*(n+1)/2;
for(int i=0;i<=n;i++){
sum=sum+i;
System.out.println("sum" +sum);
}
}
}