package com.loops;

public class ForLoopForcedExitUsingReturn {
	static boolean doStuff() {
		for(int x = 0; x < 3 ; x++) {
			System.out.println(x);
			return true;
		}
		return true;
	}
	public static void main(String[] args) {
		doStuff();
	}

}
