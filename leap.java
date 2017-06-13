import java.util.Scanner;
class Simple{
public static void main(String args[]){
System.out.println("enter the year");
Scanner scan=new Scanner(System.in);
int y;
y=scan.nextInt();
if(y%4==0){
System.out.println("leap year");
}else{
System.out.println("not a leap year");
}
}
}