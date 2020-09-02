package com.basics.java;

public class Sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java";
	char ch[]=s1.toCharArray();     
        String res=" ";
        char temp;
        System.out.println("Before Sorting:" +s1);
        
        for(int i=0; i<ch.length ; i++)
        {
            for(int j=i+1;j<ch.length; j++)
            {
                if(ch[i]>ch[j])
                {
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }

            res=res+ch[i];

        }
        
        System.out.println("After Sorting"+res);
        
        System.out.println("Ascending Order:");
        for (int i = 0; i < ch.length ; i++)	       
        {
        	String s =new String();
        	
            System.out.print(ch[i]+" ");
        }
        System.out.println(" ");
       System.out.println("decending Order:");
       for (int i = ch.length-1; i >=0  ; i--) 
        {
            System.out.print(ch[i]+"\t");
        }
	}
}
