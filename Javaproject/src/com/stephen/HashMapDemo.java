package com.stephen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1,"stephen");
		hm.put(2,"edwin");
		hm.put(3,"hari");
		hm.put(null,"hari");
		hm.put(null,"hari");
		System.out.println(hm);}}
//		Set Keys= hm.keySet();
//		 Collection values= hm.values();
//		 Set entries= hm.entrySet();
//	 System.out.println(Keys);
//	 System.out.println(values);
//	 System.out.println(entries);
//		Iterator ki=Keys.iterator();	
//		 Iterator vi=values.iterator();
//		 Iterator ei=entries.iterator();
//		 while(ki.hasNext()) {
//			 System.out.println(ki.next());
//			 
//		 }
//		 while(vi.hasNext()) {
//			 System.out.println(vi.next());
//			 
//		 }
//		 while(ei.hasNext()) {
//			 System.out.println(ei.next());
//			 
//		 }
//
//	}
//
//}
