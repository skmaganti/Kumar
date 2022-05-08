package com.jeanne.varargs;

public class Example2 {
	public static void walk(int start, int...nums) {
		System.out.println(nums.length);
	}
	public static void main(String[] args) {
		walk(1);
		walk(1,2);
		walk(1,2,3);
		walk(1,new int[] {4,5});
		walk(1,null); //since null is not an int and tries to determine length of null
	}

}
