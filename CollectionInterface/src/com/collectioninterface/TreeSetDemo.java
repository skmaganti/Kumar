package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A"); //unicode is 65
		t.add("B");
		t.add("a"); //unicode is 97 so small a is bigger than capital A
		t.add("C");
		//t.add(new Integer(10)); //classcastexception because of heterogeneous object which is not allowed
		//t.add(null); //Null pointer exception because for non empty treeset it is not allowed. Null accepts for empty TreeSet i.e., at first element
		System.out.println(t);
		
	}

}

//Null insertion is possible but only when TreeSet it empty
//After inserting null if we are trying to add any other element then NPE is displayed
//For non-empty TreeSet if we add null then again NPE