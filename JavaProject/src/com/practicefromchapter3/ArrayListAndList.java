package com.practicefromchapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
//		list.add(7); List is instantiated with Generics and so only strings are allowed
		for(String s:list) {
			System.out.println(s);
		}
	}

}
