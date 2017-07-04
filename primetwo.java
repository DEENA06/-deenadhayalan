package guvi2;
import java.util.Scanner;
public class primetwo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a1=in.nextInt();
		int a2=in.nextInt();
			   int i =0;
		       int num =0;
		       String  primeNumbers = "";

		       for (i = a1; i <= a2; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     primeNumbers = primeNumbers + i + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 10to 99 are :");
		       System.out.println(primeNumbers);
		   }
		}


