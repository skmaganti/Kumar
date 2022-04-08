package com.jeanne.loops;

public class InitializationBlock {

	public static void main(String[] args) {
		int x = 0;
		long y = 0;
		for (y = 10, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.println(x + " ");
		}
	}

}
