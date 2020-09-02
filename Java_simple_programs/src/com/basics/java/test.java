package com.basics.java;

interface test {
	abstract int a();
	int b();
	static int i=9;
	
	static void demo()
	{
		System.out.println("test");
	}
	default void demo1()
	{
		System.out.println("demo1");
	}
}
