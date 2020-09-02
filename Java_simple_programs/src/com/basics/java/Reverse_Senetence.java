package com.basics.java;

public class Reverse_Senetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//* Reverse each word
		String A ="india";
		String reverseWord = "";
		
		for(int i=A.length()-1;i>=0;i--)
		{
			reverseWord= reverseWord+A.charAt(i);
		}
		System.out.println(reverseWord);
		
		
		//* Reverse  word of senetence
		String s ="This is my country";
		String a[] = s.split(" ");
		int len = a.length;
		String revWord = "";
		
		for(int i=len-1;i>=0;i--)
		{
			revWord= revWord+a[i]+" ";
		}
		System.out.println(revWord);		
		
		//* Reverse each word of senetence
		String s1 ="This is my country";
		String a1[] = s1.split(" ");
		int len1 = a1.length;
		String revWord1 = "";
		
		for(int i=0;i<len1;i++)
		{
			String word = a[i];
			String revwords="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revwords = revwords + word.charAt(j);
			}			
			word ="";			
			revWord1= revWord1+revwords+" ";
		}
		System.out.println(revWord1);
		
		//* Reverse the word and then word of senetence
				String s2 ="This is my country";
				String a2[] = s2.split(" ");
				int len2 = a2.length;
				String revWord2 = "";
				
				for(int i=len2-1;i>=0;i--)
				{
					String word2 = a2[i];
					String revwords2="";
					
					for(int j=word2.length()-1;j>=0;j--)
					{
						revwords2 = revwords2 + word2.charAt(j);
					}
					
					word2 ="";
					
					revWord2= revWord2+revwords2+" ";
				}
				System.out.println(revWord2);
	}

}
