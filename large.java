

class Simple {
public static void main(String[] args)
{
	int num=458,digit,largest=0;
    while (num >0 ) {
        digit = num % 10;

        if (digit > largest) {
                largest = digit;
        }

        num = num / 10;
    }   System.out.println("largest digit:"+largest);

}
}
