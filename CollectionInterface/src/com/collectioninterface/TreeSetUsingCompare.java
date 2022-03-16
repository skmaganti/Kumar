//Integer objects into TreeSet, where sorting in Descending order

package com.collectioninterface;

import java.util.TreeSet;

public class TreeSetUsingCompare {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
	}

}
