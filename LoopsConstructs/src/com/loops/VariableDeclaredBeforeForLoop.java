package com.loops;

public class VariableDeclaredBeforeForLoop {

	public static void main(String[] args) {
		int x = 3;
		for(x = 12; x<20;x++ ) {
			System.out.println(x);
		}
		System.out.println("Outside the loops value is "+x); //Since x is initially declared before the loop hence variable scope exists
	}

}
