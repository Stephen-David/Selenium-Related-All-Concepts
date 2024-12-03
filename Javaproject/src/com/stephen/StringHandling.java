package com.stephen;

public class StringHandling {

	public static void main(String[] args) {
		
		 String a="java"; String b="java"; 
		 System.out.println(a.hashCode());
		  System.out.println(b.hashCode());
		 StringBuffer c =new StringBuffer("java");
		StringBuffer d =new StringBuffer("java");
		StringBuffer e =new StringBuffer("java");
		StringBuffer f =new StringBuffer("java");
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
		System.out.println(a.toLowerCase());
		System.out.println(a);
		System.out.println(c.reverse());
	}
	

}
