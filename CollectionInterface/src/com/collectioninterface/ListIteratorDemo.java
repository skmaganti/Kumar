package com.collectioninterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("satish");
		l.add("kumar");
		l.add("maganti");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			if(s.equals("satish"))
				ltr.remove();
			else if(s.equals("kumar"))
				ltr.add("rao");
			else if(s.equals("maganti"))
				ltr.set("m");
		}
		System.out.println(l);
	}

}
