package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A")); //Homogeneous objects are added but StringBuffer objects are not comparable
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

//If we are depending on default natural sorting order compulsory objects should be
//homogeneous and comparable. If the objects are not homogeneous or not comparable we get CCE

//If the corresponding class implements comparable interface then those objects are comparable objects
//String objects and all wrapper classes implements comparable but StringBuffer objects doesn't implement comparable