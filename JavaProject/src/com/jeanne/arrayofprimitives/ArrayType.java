package com.jeanne.arrayofprimitives;

import java.util.Arrays;

public class ArrayType {

	public static void main(String[] args) {
		String[] bugs= {"cricket","beetle","ladybug"};
		String[] alias = bugs;
		System.out.println(bugs.equals(alias));
		System.out.println(bugs.toString());
		System.out.println(java.util.Arrays.toString(bugs));
		System.out.println(Arrays.toString(bugs));
	}

}
