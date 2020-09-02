package com.basics.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int a = 0,e;
		int temp;
		temp =n;
		
		while(n>0)
		{
			e=n%10;
			a=a+(e*e*e);
			n=n/10;
		}
		System.out.println("values are"+a);
		
		if(temp==a)
			System.out.println("the given number is armstrong number");
		else
			
			System.out.println("the given number is not a armstrong number");
	}
}
