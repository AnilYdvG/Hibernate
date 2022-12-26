package com.collction;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Book2 
{
	String id;
	String Author;
	String Publisher;
	int Quantity;
	
	@Override
	public String toString() {
		return "Book2 [id=" + id + ", Author=" + Author + ", Publisher=" + Publisher + ", Quantity=" + Quantity + "]";
	}
	public Book2(String id, String author, String publisher, int quantity) 
	{
		super();
		this.id = id;
		Author = author;
		Publisher = publisher;
		Quantity = quantity;
	}
	public String ToString()
	{
		return Author;
	}
}

public class TreeeMp implements Comparable<Book2>
{

	
	public static void main(String[] args) 
	{
		TreeeMp treeeMp = new TreeeMp();
		
		TreeMap<String,Book2> t= new TreeMap<String, Book2>();
		
		Book2 b1=new Book2("C","A3","P3",300);
		Book2 b2=new Book2("A","A1","P1",100);
		Book2 b3=new Book2("D","A4","P4",400);
		Book2 b4=new Book2("E","A5","P5",500);
		Book2 b5=new Book2("B","A2","P2",200);
				
		t.put("B", b4);
		t.put("E", b5);
		t.put("A", b3);
		t.put("C", b2);
		t.put("D", b1);
		
		//How to perform customised sorting of id????
		
		System.out.println(t);
		
	}

	@Override
	public int compareTo( Book2 o) {
		return this.compareTo(o);
	}
}