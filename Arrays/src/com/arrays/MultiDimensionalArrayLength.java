package com.arrays;

public class MultiDimensionalArrayLength {

	public static void main(String[] args) {
		int[][] length = new int[3][3];
		System.out.println(length.length); //only base size value is printed
		System.out.println(length[0].length+length[1].length+length[2].length); //Total length can be printed in this format only
	}

}
