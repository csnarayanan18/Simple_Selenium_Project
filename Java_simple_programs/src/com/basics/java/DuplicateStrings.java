package com.basics.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "i am here i am here my firend" ;
		String[] s1= s.split(" ");
		
		Map<String, Integer> stringmap= new HashMap<String, Integer>();
		
		for (String str2: s1)
		{
			
			if(stringmap.containsKey(str2))				
			{
				stringmap.put(str2, stringmap.get(str2)+1);
			}
			else
			{
				stringmap.put(str2, 1);
			}
		}
		 
		System.out.println(stringmap);
		
		Set<String> set = stringmap.keySet();
		
		for (String ss: set)
		{
			if(stringmap.get(ss)!=1)
			{
			//System.out.println("Words :"+ss+" Repeated : " +stringmap.get(ss));
			System.out.print(ss +" ");
			}

		}
		System.out.println(" ");
	}

}
