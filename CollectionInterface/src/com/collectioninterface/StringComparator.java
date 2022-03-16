package com.collectioninterface;

import java.util.Comparator;

public class StringComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1; //This is one way of casting 
		String s2 = o2.toString(); //This is another way of expressing
		return s2.compareTo(s1);
	}

	
}
