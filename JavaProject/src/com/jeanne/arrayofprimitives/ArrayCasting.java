package com.jeanne.arrayofprimitives;

public class ArrayCasting {

	public static void main(String[] args) {
		String[] strings = {"String value"};
		Object[] objects = strings;
		String[] string1 = (String[])objects;
//		objects[0] = new StringBuilder();
		System.out.println(objects[0]);
	}

}
