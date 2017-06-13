import java.util.Scanner;

class Simple {
public static void main(String[] args){
System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
int num,digit,largest=0;
num=scan.nextInt();
    while (num >0 ) {
        digit = num % 10;

        if (digit > largest) {
                largest = digit;
        }

        num = num / 10;
    }   System.out.println("largest digit:"+largest);

}
}
