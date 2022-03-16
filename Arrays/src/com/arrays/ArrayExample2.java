package com.arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		String[] argh = {"X","Y","Z"};
		args = argh;
		for(String s:args) {
			System.out.println(s);
		}
	}

}
