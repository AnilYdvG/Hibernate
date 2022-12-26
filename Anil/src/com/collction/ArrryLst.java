package com.collction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class ArrryLst 
{
	public static void main(String[] args) 
	{				//AL is forced to hv only string obj-->as generic used
//		ArrayList<Comparable> l = new ArrayList<Comparable>(20);				//IC=20		//non-synchronized
//		ArrayList<String> l = new ArrayList<String>(20);
		ArrayList l = new ArrayList(20);
		l.add("Tom");
		l.add(5);		
		l.add("Jerry");
		l.add("Mogli");
		l.add("Ninja");
		l.add(4, "Tom");
		l.add(null);
		l.add("Stuart");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println("-+-+-+-+-+-+-+-+-+-");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Disney");
		al.add("Marvel");
		al.add("Universal");
		System.out.println(al.size());
		l.addAll(al);
		
		System.out.println(l);
		System.out.println("--------------");
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof List);
		System.out.println("--------------");
			List l1 = Collections.synchronizedList(l);  //synchronized ARRAYLIST-->thread safe
		
		//using get and set mtd
				System.out.println(l.get(2));
				System.out.println(l.set(9, "Hulk"));		//returning old obj
				System.out.println(l);
				System.out.println("===========");
				
				//using ListIterator
//				ListIterator j = l.listIterator();
//				while(j.hasNext())
//				{
////					String s = (String)j.next();
//					Object s = (Object)j.next();
//					if(s.equals("Hulk"))
//					j.remove();					//removing element by Object name
//					else if(s.equals("Ninja"))
//						j.add("Naruto");
//					else if(s.equals("Tom"))
//						j.set("Tommy");
//				}
//				l.remove(1);		//removing element by index
//				for(Object d:l)
//					System.out.println(d);
				
//		//using iterator
//		Iterator i = l.iterator();		//getting the element one by one
//		while(i.hasNext())
//			System.out.println(i.next());
		
		//using for each loop
			
			for(Object s:l)
			System.out.println(s);
			System.out.println("----------------");
			l.removeAll(al);
			System.out.println(l);
	}
}
