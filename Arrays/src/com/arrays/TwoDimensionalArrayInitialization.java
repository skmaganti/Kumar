package com.arrays;

public class TwoDimensionalArrayInitialization {

	public static void main(String[] args) {
		int[][] x = new int[2][3];
		System.out.println(x); //x is the reference variable of two dimensional array
		System.out.println(x[0]);//x[0] is one dimensional array reference
		System.out.println(x[0][0]);
		System.out.println("");
		
		int[][] y = new int[2][];
		System.out.println(y); //y is two dimensional array reference
		System.out.println(y[0]);//y[0] is one dimensional array reference which is null
		System.out.println(y[0][0]);
	}

}
//Note: if we are trying to perform any operation on NULL then we will get runtime exception