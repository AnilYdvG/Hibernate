package com.collction;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class TreeeMpComprtr implements Comparator<Map.Entry<String,Book2>>
{

	@Override
	public int compare(Map.Entry<String, Book2> o1, Map.Entry<String, Book2> o2) 
	{		
		return o2.getValue().Author.compareTo(o1.getValue().Author);
	}
}
