package com.javaoperators;

public class OROperator {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		final int z = 4;
		//y = z++; cannot be reassigned to final variable
		if ((y == x++) | (x < ++y)) {
			System.out.println("x = " + x + " y=" + y);
		}
	}

}
