package com.selftest;

public class Hexy {

	public static void main(String[] args) {
		int i = 42;
		String s = (i<40)?"life":(i>50)?"Universe":"everything";
		System.out.println(s);
	}

}
