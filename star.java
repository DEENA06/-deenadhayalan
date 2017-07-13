package deena;
import java.util.Scanner;
public class star {

	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    int abc=s.nextInt();
	  
	    for(int i=0;i<abc;i++){
	        for(int k=0;k<2;k++){
	            for(int j=i;j<abc;j++){
	                System.out.print("*");
	            }
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	    }
             
             

}
