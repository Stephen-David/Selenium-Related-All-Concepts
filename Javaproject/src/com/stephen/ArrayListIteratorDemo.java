package com.stephen;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<>();
		al.add(10);
		al.add(1035);
		al.add(10);
		al.add(null);
		al.add("stephen");
		//System.out.println(al);
		Iterator<Object> i= al.iterator();
	while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
