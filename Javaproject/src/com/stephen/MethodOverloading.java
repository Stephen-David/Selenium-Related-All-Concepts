package com.stephen;

public class MethodOverloading {
	public void m1() {
	System.out.println("m1");
	m1(10);
	m1(123.456f);}
	public void m1(int a) {
		System.out.println("int");
	}
	public void m1(float b) {
		System.out.println("float");
		
	}
	
	public static void main(String[] args) {
		new MethodOverloading().m1();
		
		
		

	}

}
