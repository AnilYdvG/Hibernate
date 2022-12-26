package com.collction;

import java.util.*;

public class WeakHasshMapp 
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
	WeakHashMap<WeakHasshMapp, String> m = new WeakHashMap<WeakHasshMapp, String>();
	WeakHasshMapp h = new WeakHasshMapp();		//object WeakHasshMapp class
	m.put(h, "Tom");
	System.out.println(m);
	h = null;		//obj ref removed
	System.gc();			//obj is eligible for GC-->as associated with HashMap
	Thread.sleep(5000);			//GC dominates HashMap
	System.out.println(m);

}
}
