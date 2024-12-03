package com.stephen;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<>();
		al.add(10);

		al.add(1035);

		al.add(14520);

		al.add(null);

		al.add("java");

		al.add(1230);

		al.add('s');

		al.add(10);

		//System.out.println(al);
		
		Iterator<Object> i= al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}



	}


