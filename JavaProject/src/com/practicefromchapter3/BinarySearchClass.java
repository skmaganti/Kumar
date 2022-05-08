package com.practicefromchapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchClass {

	public static void main(String[] args) {
		List<String> hex = Arrays.asList("300", "8", "3A", "FF","aa");
		Collections.sort(hex);
		System.out.println(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");// If 4F is available it should reside at index 2. Negate this value and add -1 i.e., -2-1 = -3
		System.out.println(x + " " + y + " " + z);
	}

}
//Numbers sort before letters and strings sort alphabetically