package com.stephen;

public class Return {
	static int c;
	public static int add() {
		int a=10;
		int b=20;
		c=a+b;
		return c;
		
	}
	public static int sub() {
		int a=10;
		int b=20;
		c=b-a;
		return c;
		
	}
	public static String getdata() {
	String a ="hello";
			return a;
		
	}
	
	

	public static void main(String[] args) {
		 int a=add();
	     int b= sub();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(getdata());
		
		

	}}


