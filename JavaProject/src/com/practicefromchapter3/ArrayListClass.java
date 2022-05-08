package com.practicefromchapter3;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1, 6); //set method replaces the value at index position
		values.remove(0);
		for(Integer v:values) System.out.println(v);
	}

}
