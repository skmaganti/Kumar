package com.jeanne.arrayofprimitives;

public class ArrayLoop {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+5;
//		System.out.println(numbers[i]);
		}
		
		numbers[10] = 3;
		numbers[numbers.length] = 5;
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+5;
			System.out.println(numbers[i]);
		}
			

	}
	
	
}
