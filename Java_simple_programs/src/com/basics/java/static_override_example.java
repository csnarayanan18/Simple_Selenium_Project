package com.basics.java;

public class static_override_example extends static_override_Test{
	 public static void display() {
         System.out.println("Static or class method from Derived");
    }
	 int add(int x, int y)
	{
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_override_Test st =new static_override_example();
		
System.out.println(st.add(10,20));
static_override_Test.display();
	}

}
