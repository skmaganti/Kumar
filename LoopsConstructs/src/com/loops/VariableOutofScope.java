package com.loops;

public class VariableOutofScope {

	public static void main(String[] args) {
		for (int x = 1; x<2;x++) {
			System.out.println(x);
		}
		//System.out.println(x); x is out of scope
	}

}
