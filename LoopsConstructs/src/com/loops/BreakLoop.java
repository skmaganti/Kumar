package com.loops;

public class BreakLoop {

	public static void main(String[] args) {
		boolean problem = true;
		while(true) {
			if(problem) {
				System.out.println("There was a problem");
				break;
			}
		}
	}

}
