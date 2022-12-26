package com.collction;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;

class Book
{
	int id;
	String Name;
	String Author;
	String Publisher;
	int Quantity;
	Book(int id,String Name,String Author,String Publisher,int Quantity)
	{
		this.id = id;
		this.Name= Name;
		this.Author=Author;
		this.Publisher= Publisher;
		this.Quantity=Quantity;
	}
}

public class HshhSett 
{
	public static void main(String[] args) 
	{
		HashSet<Book> s = new HashSet<>();
		
		Book b1 = new Book(01,"Mowgli-The jungle book","Rudyard Kipling","Macmillan",500);
		Book b2 = new Book(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		Book b3 = new Book(03,"The Power of Positive Thinking","Norman Vincent Peale","Prentice Hall",600);
		Book b4 = new Book(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		Book b5 = new Book(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		
		s.add(b1);
		s.add(b2);
		s.add(b3);
//		s.add(b4);
//		s.add(b5);
		
		
		System.out.println(s.size());
		
		for(Book b:s)
			System.out.println("Book with ID: "+b.id+", Name: "+b.Name+", Author: "+b.Author+", Publisher: "+b.Publisher+", have "+b.Quantity+" quantity");
		
		System.out.println("----------------");
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Tom");
		hs.add("Jerry");
		hs.add(10);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.hashCode());
		System.out.println("=============");
		
		Iterator i = hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("---------------");
		
//		hs.removeIf(str->((String) str).contains("Jerry"));
//		System.out.println(hs);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(hs instanceof RandomAccess);
		System.out.println(hs instanceof Serializable);
		System.out.println(hs instanceof Cloneable);
		
	}

}
