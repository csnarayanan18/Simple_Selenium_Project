package com.basics.java;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class repeatedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sent= "java is a programming lanauage";
		char[] c = sent.toCharArray();		
		Map<Character, Integer> charmap= new LinkedHashMap<Character, Integer>();
		for(char cvalues : c)
		{
			if(charmap.containsKey(cvalues))
			{
				
			charmap.put(cvalues, charmap.get(cvalues)+1);			
			}
			else
			{
				charmap.put(cvalues, 1);				
			}			
		}
		System.out.println(charmap);

		Set<Character> setc= charmap.keySet();
		for(char cvalue: setc)
		{
			//if((setc.contains(cvalue)))
			System.out.println("Letters : " + cvalue + " Repeated " +charmap.get(cvalue));
			
		}
	}

}
