package com.collction;

import java.util.Enumeration;
import java.util.Vector;

public class Cursr1Enmrtn 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		for(int i=0;i<=15;i++)
			v.add(i);
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println(v);
		
		//Printing Enumeration(I) implemented class object
		System.out.println(e.getClass().getName());
		
	}

}
