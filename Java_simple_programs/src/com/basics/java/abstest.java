package com.basics.java;
public class abstest extends testabstract{

	/*
	 * @Override void demo() { // TODO Auto-generated method stub
	 * System.out.println("abstract ,method override");
	 * 
	 * }
	 */
	public static void main(String args[])
	{
		testabstract atest = new abstest();
		//atest.demo();
		testabstract.demo1();
		atest.demo2();
	}
	

}
