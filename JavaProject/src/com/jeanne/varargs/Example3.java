package com.jeanne.varargs;

public class Example3 {
	public static void run(int...nums) {
		System.out.println(nums[1]);
	}
	public static void main(String[] args) {
		run(11,22); //It calls vararg parameter two parameters. size is 2 and nums[1] is 22 
	}

}
