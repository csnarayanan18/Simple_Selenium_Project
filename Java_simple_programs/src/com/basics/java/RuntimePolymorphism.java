package com.basics.java;

class Bank
{
	float Interest()
	{
		return 0;
	}
}

class sbi extends Bank
{
	float Interest()
	{
		return 10;
	}
}
class icici extends Bank
{
	float Interest()
	{
		return 5;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Bank b;
			b= new sbi();
		System.out.println("SBI nterest is : "+b.Interest());
		
		 b =  new icici();
		System.out.println("Icici Interest is : "+b.Interest());

	}

}
