package com.stephen;

public class Coding {
	//static Coding Coding;
	
	public static void m1() {
		System.out.println("m1");
		//Coding=new Coding();
		
		
	}
	public void m2() {
		System.out.println("m2");
		
	}
	public Coding() {
		System.out.println("constructor");
		
	}
	static {
		System.out.println("static");
	}
	{
		System.out.println("instance");
	}
	public static void main(String[] args) {
		
m1();
//Coding=new Coding();
new Coding();
new Coding().m2();
	}

}
