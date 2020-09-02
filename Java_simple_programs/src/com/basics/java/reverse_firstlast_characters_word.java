package com.basics.java;

public class reverse_firstlast_characters_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//* Reverse  word of sentence
		String s ="This is my country";
		String a[] = s.split(" ");
		int len = a.length;
		String revWord = "";
		
		for(int i=0;i<len;i++)
		{
			String word = a[i];
			int length = word.length();
			
			char ch = 0;
			
			for(int j=0;j<length;j++)
			{
			if(j==0)
			{
				ch = word.charAt(length-1);
			}
			else if(j==length-1)
			{
				ch = word.charAt(0);
			}
			else
			{
			ch = word.charAt(j);
			}
			revWord= revWord+ch;
			
			}
			revWord = revWord +" ";
			//word ="";		
		}		
		System.out.println(revWord);
	}
}
