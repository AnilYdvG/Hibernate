package com.collction;

import java.util.ArrayList;
import java.util.Vector;

public class Vctor 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(4,2);
		v.addElement(1);
		v.addElement("Tom");
		v.add("Jerry");
		v.add(45);
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		v.add(0, "Mogli");
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.indexOf("DonaldDuck", 0));
		System.out.println(v.indexOf("Tom",1));
		
		System.out.println(v.firstElement());
		
		if(v.contains(4))
		System.out.println(v.lastIndexOf(4));
		else
			System.out.println("value is not available");
		
		System.out.println(v.remove((Integer)45));
		
		v.add(4, 65);
		System.out.println(v);
		
		v.removeElementAt(4);
		System.out.println(v);
		
		System.out.println(v.hashCode());
		
		System.out.println(v.get(3));
		
		ArrayList l = new ArrayList(20);
		l.add("Tom");
		l.add(5);		
		l.add("Jerry");
		l.add("Mogli");
		l.add("Ninja");
		l.add(4, "Tom");
		l.add(null);
		l.add('A');
		
		v.addAll(l);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Vector v1 = new Vector(l);
		System.out.println(v1);
		System.out.println(v1.capacity());
		

	}

}
