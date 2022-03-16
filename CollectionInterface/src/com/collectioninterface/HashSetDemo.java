package com.collectioninterface;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add(null);
		h.add(10);
		h.add("Z");
		h.add("D");
		System.out.println(h.add("Z"));
		System.out.println(h);
	}

}
