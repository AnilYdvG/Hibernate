package com.collction;

import java.util.LinkedList;
import java.util.ListIterator;

public class Cursr3LstItratr 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("Tom");
		l.add("Jerry");
		l.add("Mogli");
		l.add("Snoopy");
		System.out.println(l);
		
		ListIterator i = l.listIterator();
		
		while(i.hasNext())
		{
//			System.out.println(i.next());
			String s = (String)i.next();
			
			if(s.equals("Snoopy"))
				i.remove();
			else if(s.equals("Mogli"))
				i.add("Pluto");
			else if(s.equals("Tom"))
				i.set("Tommy");
			
		}
		System.out.println(l);
		
		//Printing ListIterator(I) implemented class object
		System.out.println(i.getClass().getName());
		
	}

}
