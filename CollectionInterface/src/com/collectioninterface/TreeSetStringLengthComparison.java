package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetStringLengthComparison {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StringComparatorLengthComparison());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
