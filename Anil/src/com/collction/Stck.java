package com.collction;

import java.util.Stack;

public class Stck 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("Tom");
		s.push('A');
		s.push(50);
		s.push("Jerry");
		s.push("Mogli");
		s.push("Stuart");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.empty());
		
		System.out.println(s.search("Mogli"));
		System.out.println(s.search("Ninja"));
	}

}
