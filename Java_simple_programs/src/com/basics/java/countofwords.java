package com.basics.java;

public class countofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I am Suriya";
		String a[] = s.split(" ");
		System.out.println(a.length);
		int count =1;
		//int length = s.length();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				count++;
		}   
System.out.println(""+count);
	}

}
