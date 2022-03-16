package com.collectioninterface;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsImplementationClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		java.util.Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}

}
