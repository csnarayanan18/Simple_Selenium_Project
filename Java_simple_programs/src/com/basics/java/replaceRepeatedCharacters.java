package com.basics.java;

import java.util.Scanner;

public class replaceRepeatedCharacters {

	public static void main(String[] args) {
		/*
		 * Scanner ob=new Scanner(System.in); System.out.println("Enter a sentence : ");
		 * String n=ob.nextLine();
		 */
		
		String n = "The the string String string stringing.";
		n=n.toUpperCase();
		boolean b=false;
		for(int i=0;i<n.length();i++)
		{
		b=false;
		char ch=n.charAt(i);
		if(ch!='*')
		{
				for(int j=n.length()-1;j>i;j--)
		{
		char ch1=n.charAt(j);
		if(ch==ch1)
		{
		StringBuffer obj=new StringBuffer(n);
		obj.setCharAt(j,'*');
		n=""+obj;
	}
	}
}
}
System.out.println(n);
	}

}
