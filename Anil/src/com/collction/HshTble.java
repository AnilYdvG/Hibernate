package com.collction;

import java.util.Hashtable;
import java.util.Map;

public class HshTble 
{
	int i;
	HshTble(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
	
	public static void main(String[] args) 
	{
		Hashtable<Object,String> h = new Hashtable<Object, String>();
		
		h.put(new HshTble(5), "A");
		h.put(new HshTble(2), "B");
		h.put(new HshTble(6), "C");
		h.put(new HshTble(7), "C");
		h.put(new HshTble(6), "D");
		h.put(new HshTble(15), "E");
		h.put(new HshTble(23), "F");
		h.put(new HshTble(16), "G");
//		h.put(new HshTble(18), null);
		h.put(new HshTble(56), "I");
		
		System.out.println(h);
		System.out.println(h.hashCode());
		System.out.println(h.size());
		
		for(Map.Entry<Object, String> e:h.entrySet())
		{
			Object o = e.getKey();
			String s = e.getValue();
			System.out.println(o+" "+s+" "+o.hashCode());			
		}		
	}
}
