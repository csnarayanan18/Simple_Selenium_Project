package com.basics.java;

public class palindromeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="MADAm";
		String rev = "";
		
		StringBuffer sb = new StringBuffer(s);
		String sb11= sb.reverse().toString();
		
		if(s.equals(sb11))
		{
			System.out.println(s+"is a palindrome String "+sb11);
		}
		else
		{
			System.out.println(sb.reverse()+" is not a palindrome  "+sb11);
		}
		
		
		 /* with loops*/
		
		int length = s.length();
		
		//for (int i= length-1;i>=0;i--)
		for(int i=length-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		
		if(s.equals(rev))
			System.out.println(s+" is a palindrome " +rev);
		else
			System.out.println(s+" is not a palindrome "+rev);

	   }
	}

 	
