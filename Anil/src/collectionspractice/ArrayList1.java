package collectionspractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("green");
		al.add("Blue");
		al.add("Indigo");
		al.add("Voilet");
				
		
		ArrayList<String> l=new ArrayList<>();
		l.add("Red");
		l.add("Orange");
		l.add("Yellow");
		
		
		
		al.addAll(0,l);
		al.add(0,"Black");
		
		System.out.println("Element at index 3--> "+al.get(3));
		System.out.println("----------");
		al.set(3, "Magenta");
		System.out.println("Element at index 3--> "+al.get(3));
	
		System.out.println("----------");
		al.remove(3);
		System.out.println("Element at index 3--> "+al.get(3));
		System.out.println("----------");
		
		System.out.println(al.size());
		for(int i=0;i<al.size()-1;i++)
		{
			if(al.get(i)=="Green")
			System.out.println("Index of Green color is "+al.get(i));	
		}
		System.out.println("-----");
		al.set(3, "Brown");
		System.out.println("Element at index 3--> "+al.get(3));
		System.out.println("-----");
		Collections.sort(al);
		
		for(String i:al)
		{
			System.out.println(i);
		}
	}

}
