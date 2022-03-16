package com.regularexpressions;

public class StringSplit {

	public static void main(String[] args) {
		String s = "satish kumar maganti";
		String[] s1 = s.split("\\s");
		for(String s2:s1) {
			System.out.println(s2);
		}
	}

}
