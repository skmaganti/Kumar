package com.practicefromchapter3;

import java.util.Arrays;
import java.util.List;

public class StringClass {

	public static void main(String[] args) {
		String [] names = {"Tom", "Dick", "Harry"};
		List<String> list = Arrays.asList(names);
		list.set(0, "Sue");
		System.out.println(names[0]);
	}

}
