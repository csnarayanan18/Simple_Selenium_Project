package com.basics.java;

public class greaterthan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$52";
		String s1= s.substring(1);
		Integer i = Integer.parseInt(s1);
		int x=i;
		System.out.println(x);
		if (x>50)
		{
			System.out.println(x +" is greater than 50");
		}
		else
		{
			System.out.println(x +" is not  greater than 50");
		}
		
		String a = "$52.33";
		String a1= a.substring(1);
		Double d = Double.parseDouble(a1);
		double d1 =d;
		System.out.println(d1);
		if (d1>=52.33)
		{
			System.out.println(d1 +" is greater than 52.22");
		}
		else
		{
			System.out.println(d1 +" is not  greater than 52.33");
		}
	}

}
