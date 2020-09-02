package com.basics.java;

class interfaceclass implements test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test inter = new interfaceclass();
	
		System.out.println(inter.a() +" "+inter.b()+" " );
		inter.demo1();
	}

	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		return 2;
	}

}
