package com.basics.java;

class test1
{
	void a()
	{
		System.out.println("A method");
	}
}

public class Test_Polymorphism extends test1 {
	void a()
	{
		System.out.println("B method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 tp1= new test1();
		tp1.a();
		test1 tp =   new Test_Polymorphism();
		tp.a();	

	}

}
