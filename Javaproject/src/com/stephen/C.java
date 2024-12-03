package com.stephen;

public class C extends B{
	public void m5() {
		System.out.println("stephen");
	}
	public void m6() {
		System.out.println("logesh");
	}
	public C() {
		System.out.println("C constructor");
	}
	public static void main(String[] args) {
		C object=new C();
		object.m5();
		object.m6();
        m1();
		m2();
		m3();
		m4();
		
	}

}
