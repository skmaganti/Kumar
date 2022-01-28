package com.localprimitives;

public class TestLocal {

	public static void main(String[] args) {
		int x;
		if(args[0] != null) {
			x = 7;
			System.out.println(x);
		}
//		int y =x; compile error as you need to initialize the variable outside the conditional block
	}

}
