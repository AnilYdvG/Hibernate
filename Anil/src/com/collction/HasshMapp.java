package com.collction;

import java.util.HashMap;

public class HasshMapp 
{
		public String toString()
		{
			return "HasshMapp";
		}
		public void finalise()
		{
			System.out.println("Running Finalise() mtd");
		}
		
	public static void main(String[] args) throws InterruptedException 
	{
		HashMap<HasshMapp, String> m = new HashMap<HasshMapp, String>();
		HasshMapp h = new HasshMapp();		//object HasshMapp class
		m.put(h, "Tom");
//		System.out.println(m);
		h = null;		//obj ref removed
		System.gc();			//obj is eligible for GC-->as associated with HashMap
		Thread.sleep(5000);			//HashMap dominates GC
		System.out.println(m);
		
	}
}