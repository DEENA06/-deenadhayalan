package com.deen.wipro;

public class Player102 {

	public static void main(String[] args) {
		int x=4;
		for(int i=1;i<=x;i++)
		{
			for(int k=x-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		for(int i=x-1;i>=1;i--)
		{
			for(int k=x-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
      }
	}


