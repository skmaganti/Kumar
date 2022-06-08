package com.jeanne.staticandinstancemethods;

import java.util.ArrayList;

public class FinalClass {
	private static final ArrayList<String> values = new ArrayList<>();
	public static void main(String[] args) {
		values.add("Changed"); // Allowed to call methods on reference variables
		ArrayList<String> fc = new ArrayList<>();
//		values = fc; // Reassign is not possible because of final keyword used in the initial declaration
	}

}
