package com.basics.java;

public class countofletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s ="java trS";	
	int x =s.length();
	System.out.println(x);
	int count=0;
	
	for(int i=0;i<x;i++)
	{
		if(s.charAt(i)!=' ' )
		{
			count++;
		}
	}
	System.out.println("count characters in a string is : "+count);

	}

}
