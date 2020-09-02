package com.interfacecheck;

public class Test implements Intercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intercheck t = new Test();
		t.draw();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}

}
