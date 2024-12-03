package com.stephen;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(100);
		/*
		 * al.add("stephen"); al.add('s'); al.add(null);
		 */	
		 al.remove(2); 
		System.out.println(al);
		
	//for(int i=0;i<al.size();i++) {
	//	System.out.println(al.get(i));
		
		//  al.remove(2); 
		 // System.out.println(al);
		 
		
	
}}
