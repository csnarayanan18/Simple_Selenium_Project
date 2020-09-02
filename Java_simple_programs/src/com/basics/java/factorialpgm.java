package com.basics.java;

import java.util.Scanner;

public class factorialpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");;
		int n =sc.nextInt();
		
		int fact = 1,i;
		//int n=2;
		
		for (i=1;i<=n;i++)
		{
			fact = fact*i;
		}
System.out.println(n+" factorial values is :" + fact);
	}

}
