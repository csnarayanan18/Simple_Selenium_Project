package com.basics.java;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");;
		int num = sc.nextInt();
		
		//int num=457888884;
		int temp,r,rev=0;
		
		temp=num;
		
		while(num>0)
		{
			r = num%10;
			rev =r+ (rev*10);
			num=num/10;					
		}
		System.out.println("Actual number is : "+temp);
		System.out.println("Reverse number is : "+rev);
		
		if(temp==rev)
		System.out.println("Palindrome number " +rev);
		else
			System.out.println("Not a Palindrome number " +rev);
sc.close();
	}

}
