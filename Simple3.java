package com.java.guvi;
import java.util.*;
public class Simple3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();
		String[] s1=str.split(" ");
		str="";
		
		for(int i=s1.length-1;i>=0;i--)
		str=str+s1[i]+" ";	
		
		str.trim();
		System.out.println(str);
	}


}
