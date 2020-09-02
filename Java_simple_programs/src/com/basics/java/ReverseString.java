package com.basics.java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "xcvb";
		String rev="";
		String temp = str;
		int x= str.length();
		for(int i=x-1; i>=0; i--)
		{
			
			rev =rev+str.charAt(i);
		}
		System.out.println("Original string is:"+str+"  reverse string is:  " +rev);
		
		
		if(temp.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("Its not a palindrome string");
		}
	}

}
