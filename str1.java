package com.java.guvi;
import java.util.Scanner;
public class str1 {

	public static void main(String[] args) {
		
			    Scanner in=new Scanner(System.in);
			    System.out.println("ENTER STRING ARRAY LENGTH");
			    int len=in.nextInt();
			    String arr[]=new String[len];
			    for(int i=0;i<len;i++) {
			       arr[i]=in.next();
			    }
			    for(int j=0;j<len;j++)
			    {
			      if(arr[j].length()==1)
			      {
			         System.out.println(arr[j]);
			        
			       }
			      }
			    }
	

	}


