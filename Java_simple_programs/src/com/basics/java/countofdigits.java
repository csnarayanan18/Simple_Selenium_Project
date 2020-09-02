package com.basics.java;

public class countofdigits 
{	
	public static void main(String args[])
	{
		int n=178231;
		int count=0;		
		while(n>0)
		{
			n = n /10;
			//count=count+1;
			count++;
		}
		System.out.println("no.of digits are : " + count);
	}
}
