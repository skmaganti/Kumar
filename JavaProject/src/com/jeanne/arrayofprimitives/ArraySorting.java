package com.jeanne.arrayofprimitives;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] numbers = {9,5,2};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
