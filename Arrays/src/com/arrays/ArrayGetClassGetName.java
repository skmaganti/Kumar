package com.arrays;

public class ArrayGetClassGetName {

	public static void main(String[] args) {
		int[] x = new int[3];//At the time of array declaration compulsory we should declare size
		int[][] y = new int[3][3];
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
	}

}
