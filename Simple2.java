package com.java.guvi;
import java.util.*;
public class Simple2 {

	public static void main(String[] args) {
		{
		     Scanner s=new Scanner(System.in);
		     System.out.println("enter the number of array");
		     int n=s.nextInt();
		     System.out.println("Enter the Elements");
		     int[] Arr=new int[n];
		     for(int i=0;i<n;i++)
		     {
		       Arr[i]=s.nextInt();
		     }
		     System.out.println("target");  
		     int m=s.nextInt();
		     for(int i=0;i<Arr.length-1;i++)
		     {
		       if(Arr[i]+Arr[i+1]==m)
		       {
		        System.out.println("THE ELEMENTS ARE "+Arr[i]+" AND "+Arr[i+1]); 
		       }
		     } 
		   }

	}

}
