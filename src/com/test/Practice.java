package com.test;

import java.util.Scanner;

public class Practice {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    long n=sc.nextLong();
		    System.out.println(n/2+1);
		}
	}

}
