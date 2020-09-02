 package com.basics.java;

import java.util.Arrays;

public class removeduplicatelettersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringWithDuplicates = "java jkj ko klkloppp";
		char[] characters = stringWithDuplicates.toCharArray();
		int length = characters.length;
		System.out.println("String with duplicates : " + stringWithDuplicates);
	for (int i = 0; i < length; i++) 
	{
            for (int j = i + 1; j < length; j++) 
            { 
                if (characters[i] == characters[j]) 
                {
                	characters[j] = characters[length-1];
                    length--;
                    j--;
                }
            }
        }
	
	char[] chartDuplicates = Arrays.copyOf(characters, length);
	
	System.out.print("String after duplicates removed : ");
	//delete the duplicate element by shifting the elements to left
    for (int k = 0; k < chartDuplicates.length; k++) 
    {
    	
    	System.out.print( chartDuplicates[k]);
    }
	}

}
