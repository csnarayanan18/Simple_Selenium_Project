package com.basics.java;

import java.util.Arrays;

public class remove_duplicate_words_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Welcome to Welcome Java Session Java Session Session Java pgm"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		int len= words.length;
		for(int i=0;i<len;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<len;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					//words[j]= " ";			//Replace the duplicate words
					words[j]=words[len-1];
					//System.out.println(words[j]);
					j--;
					len--;					
				}
			}	
		}
		String a1[] = Arrays.copyOf(words, len);
		for(int k=0;k<a1.length;k++)		//Displaying the String without duplicate words	
		{
			{
				System.out.print(a1[k]+" ");
			}
			
	     }  

	}

}
