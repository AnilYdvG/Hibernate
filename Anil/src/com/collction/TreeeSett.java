package com.collction;

import java.util.Set;
import java.util.TreeSet;


class Books implements Comparable<Books>
{
	int id;
	String Name;
	String Author;
	String Publisher;
	int Quantity;
	public Books(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		Name = name;
		Author = author;
		Publisher = publisher;
		Quantity = quantity;
	}
	public int compareTo(Books b)
	{
		if(id>b.id)
			return 1;
		else if(id<b.id)
			return -1;
		else
			return 0;
	}
	
}

public class TreeeSett 
{
	public static void main(String[] args) 
	{
		TreeSet<Books> s = new TreeSet<>();
		
		Books b1 = new Books(01,"Mowgli-The jungle Books","Rudyard Kipling","Macmillan",500);
		Books b2 = new Books(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		Books b3 = new Books(03,"The Power of Positive Thinking","Norman Vincent Peale","Prentice Hall",600);
		Books b4 = new Books(03,"The Power of Positive Thinking","Norman Vincent Peale","Prentice Hall",600);
		Books b5 = new Books(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		
		s.add(b3);
		s.add(b2);
		s.add(b1);
		s.add(b4);
		s.add(b5);
		
		
		for(Books b:s)
			System.out.println("Book with ID: "+b.id+", Name: "+b.Name+", Author: "+b.Author+", Publisher: "+b.Publisher+", have "+b.Quantity+" quantity");
		
		
		TreeSet<String> s1 = new TreeSet<>();
		s1.add("Tom");
		s1.add("Jerry");
		s1.add("Mogli");
		s1.add("Scooby");
		s1.add("Jerry");
		s1.add("Mogli");
		
		for(String t:s1)
			System.out.println(t);
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(10);
		t.add(3);
		t.add(21);
		t.add(12);
		t.add(45);
		t.add(90);
		t.add(101);
		t.add(3);
		t.add(21);
		
		for(Integer i:t)
			System.out.println(i);
		System.out.println(t.descendingSet());
		System.out.println(t);
		System.out.println(t.headSet(45,true));
		System.out.println(t);
		System.out.println(t.tailSet(10,false));
		System.out.println(t.subSet(12, false, 90, false));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t);
		
		
		
	}

}
