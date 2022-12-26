package com.collction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.RandomAccess;
//import java.util.*;

public class LnkdLst 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(20);
		al.add("Tom");
		al.add(5);		
		al.add("Jerry");
		al.add("Mogli");
		al.add("Ninja");
		al.add(4, "Tom");
		al.add(null);
		al.add("Stuart");
			
		LinkedList ll = new LinkedList(al);
		
		System.out.println(ll);
			
			System.out.println("**************");

			LinkedList l = new LinkedList();
			l.add("Tom");
			l.addLast(169);
			l.add(1,"Jerry");
			l.add("Bugs");
			l.add("Micky");
			l.add("Mouse");
			System.out.println(l);

			l.addFirst("Bunny");
			l.addFirst("Bugs");
			System.out.println(l);
			
			System.out.println("===========");
			
			LinkedList l2= new LinkedList();
			l2.add("Donald");
			l2.add("Charlie");
			l2.add("Snoopy");
			l2.add(60);
			l2.addLast("Snoopy");
			System.out.println(l2);
			
			System.out.println("------------");
			
			l.addAll(2, l2);
			
			System.out.println(l);
			
			System.out.println("..............");
			
			ListIterator i = l.listIterator();
			while(i.hasNext())
				System.out.println(i.next());
			
			System.out.println("``````````````````");
			System.out.println(l.get(2));
			System.out.println(l.getFirst());
			System.out.println(l.getLast());
			
			System.out.println("~~~~~~~~~~~~~~~");
			
			System.out.println(l.set(3, "Fred"));
			
			System.out.println("______________");
			
			System.out.println(l);
			
			System.out.println("!!!!!!!!!!!!!!!!!");
			
			System.out.println(l.removeFirst());
			System.out.println(l.removeFirstOccurrence("Snoopy"));
			System.out.println(l.removeAll(l2));
			System.out.println(l.removeLastOccurrence("Bugs"));
			System.out.println(l.removeLast());
			
			System.out.println(l);
			
			l2.clear();
			
			System.out.println(l2);
			
			System.out.println(l instanceof Serializable);
			System.out.println(l instanceof Cloneable);
			System.out.println(l instanceof RandomAccess);
			System.out.println(l instanceof List);
			System.out.println(l instanceof Deque);
			System.out.println(l instanceof Queue);
		
	}

}
