package com.practicefromchapter3;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		int[] random = {6,-4,12,0,-10};
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
	}

}
