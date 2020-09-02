package com.basics.java;

public class static_oveload_example {
	
	   static int add(int x, int y)
	{
		int c= x+y;
		return c;
		
	}
	static int add(int x, int y, int z)
	{
		int c= x+y+z;
		return c;
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,10,30));
	}

}
