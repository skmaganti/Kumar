package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetUsingCompareDemo3 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StringBufferComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Satish"));
		t.add(new StringBuffer("Kumar"));
//		t.add(new StringBuffer(10));
		System.out.println(t);
	}

}
