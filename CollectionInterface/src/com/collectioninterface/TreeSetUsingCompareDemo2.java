package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetUsingCompareDemo2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StringComparator());
		t.add("satish");
		t.add("sarada");
		t.add("Satish");
		t.add("Lishant");
		System.out.println(t);
	}

}
