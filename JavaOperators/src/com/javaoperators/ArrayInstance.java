package com.javaoperators;

public class ArrayInstance {

	public static void main(String[] args) {
		int n = 10;
		int[] nums = new int[n];
		System.out.println(nums instanceof Object);
	}
//arrays are objects even though array is an array of primitives
}
