package com.generics;

import java.util.ArrayList;

public class GenericsClass {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Satish");
		al.add("Kumar");
		//al.add(new Integer(10));
		String s = al.get(1);
		System.out.println(s);
		
	}

}
