package com.collction;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.RandomAccess;

class Book1
{
	int id;
	String BookName;
	String BookAuthor;
	String BookPublisher;
	int Quantity;
	Book1(int id,String BookName,String BookAuthor,String BookPublisher,int Quantity)
	{
		this.id=id;
		this.BookName=BookName;
		this.BookAuthor=BookAuthor;
		this.BookPublisher=BookPublisher;
		this.Quantity=Quantity;
	}
}

public class LnkdHshSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Book1> l = new LinkedHashSet<>();
		
		Book1 b1 = new Book1(01,"Mowgli-The jungle book","Rudyard Kipling","Macmillan",500);
		Book1 b2 = new Book1(02,"Tom & Jerry","Willim Hanna","Hanna and Barbera",400);
		Book1 b3 = new Book1(03,"The Power of Positive Thinking","Norman Vincent Peale","Prentice Hall",600);
		
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		System.out.println(l);
		System.out.println(l.hashCode());
		for(Book1 b:l)
			System.out.println("Book with ID: "+b.id+", Name: "+b.BookName+", Author: "+b.BookAuthor+", Publisher: "+b.BookPublisher+", have "+b.Quantity+" quantity");
		
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
				
	}
	

}
