package com.basics.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicateletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "i am here i am here my firend" ;
		char[] ch= s.toCharArray();
		
		Map<Character, Integer> charmap= new HashMap<Character, Integer>();
		
		for (char c: ch)
		{
			
			if(charmap.containsKey(c))				
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);
			}
		}
		 
		System.out.println(charmap);
		
		Set<Character> set = charmap.keySet();
		
		for (char ss: set)
		{
			
			//System.out.println("Words :"+ss+" Repeated : " +charmap.get(ss));
			
			if(charmap.get(ss)!=1)
			{
				System.out.print(" "+ss);
			}

		}
		System.out.println(" ");
	}

}
