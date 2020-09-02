package com.basics.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist_Example {


	public static void main(String args[])	
	{
		String s[]= {"abc", "def", "mno", "xyz", "pqr", "xyz"};
		
		ArrayList<String> al= new ArrayList<String>();
		List<String> alArray = Arrays.asList(s);
		al.addAll(alArray);
		al.add("Sachin");
		al.add("Souvrav");
		al.add("Shewag");
		al.add("Dravid");
		al.add("Gilly");
		
		System.out.println("values are"+al);
		
		for (int i=0;i<al.size();i++)
		{
			if(al.get(i).startsWith("S"))
				{
					System.out.println("S names are : "+al.get(i));
				}
				else
				{
					System.out.println("other names are : "+al.get(i));
				}
		}
		
		al.remove(2);
		
		System.out.println("values are"+al);
		
		
		
	}
	
}
