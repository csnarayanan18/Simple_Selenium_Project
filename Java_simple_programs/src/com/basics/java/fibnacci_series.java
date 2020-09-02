package com.basics.java;

public class fibnacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int n1=0,n2=1,n3;
		 * 
		 * int count=10;
		 * 
		 * System.out.print(n1+ " " +n2);
		 * 
		 * for(int i=2; i<=count; i++){
		 * 
		 * n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3; }
		 */
		
		
		int n1=0, n2=1, n3 = 0;
		int count = 400;
		for(int i=1;i<=count;i++)
		{
			n3=n1+n2;			
			if(n3>40)
			{
				System.out.print(n3+" ");
			}
			n1=n2;
			n2=n3;	
		}		
			
	}

}
