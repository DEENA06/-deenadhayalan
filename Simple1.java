package com.java.guvi;
import java.util.*;
public class Simple1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		int sum=0,i=0;
		while(A1>=A2) {
			
			A1=A1-A2;
			i++;
			
		}
		System.out.println(i);
		System.out.println(A1);
		

	}

}
