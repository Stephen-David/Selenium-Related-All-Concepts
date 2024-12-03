package com.stephen;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hm= new LinkedHashMap();
		hm.put(1,"ameer");
		hm.put(1,"ediwn");
		hm.put(1,"stephen");
		hm.put(2,'s');
		hm.put(3,10);
		hm.put(null,"edwin");
		hm.put(null,"edwin");
		System.out.println(hm);

	}

}
