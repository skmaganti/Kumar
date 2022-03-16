package com.arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[][] a = new int[4][3]; // 5 objects created
		a[0] = new int[4]; //one object created
		a[1] = new int[2]; // one object created
		a = new int[3][2]; //4 objects created
	}
}

//Total 11 objects created and 7 objects eligible for GC
