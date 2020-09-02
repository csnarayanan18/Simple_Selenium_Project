package com.basics.java;

 class Base
{
	void test()
	{
		System.out.println("Base class method");
	}
}

public class child extends Base {
	void test()
	{
		System.out.println("child class method");
	}
	
	public static void main(String args[])
	{
		Base b = new child();
		b.test();
	}

}
