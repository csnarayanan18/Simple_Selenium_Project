package com.basics.java;

public class print_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 5;
		printstars(n);

	}

	private static void printstars(int n) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		
		int i,j;
		for (i=0;i<n;i++){
			
			for(j=0;j<=i;j++)
			{
				if(i==0)
				{
					System.out.print(" "+n1);
				}
				else if(i==1 && j==0)
				{
					System.out.print(" "+n2);
  				}
				else
				{
					n3=n1+n2;
					System.out.print(" "+n3);
					n1=n2;
					n2=n3;
				}
				
				
			}
			System.out.println();
		}
	}

}
