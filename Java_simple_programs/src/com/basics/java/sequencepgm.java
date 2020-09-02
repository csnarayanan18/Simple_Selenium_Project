package com.basics.java;

public class sequencepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.print(n);
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				n=n*i;
			}
			else
			{
				n=n+i;
			}
			System.out.print(" "+n);
		}
		
		
	}

}
