package com.collction;

import java.util.ArrayList;
import java.util.Iterator;


public class Cursr2Itratr 
{
	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		for(int i=0;i<=15;i++)
			l.add(i);
		
		System.out.println(l);
		System.out.println("==========");
		
		Iterator itr = l.iterator();	
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			if(i%2==0)
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println("-----------");
		System.out.println(l);
		
		//Printing Iterator(I) implemented class name
		System.out.println(itr.getClass().getName());
		
	}

}
