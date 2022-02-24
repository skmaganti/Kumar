package com.javaoperators;

public class TestOR {

	public static void main(String[] args) {
		if(isItSmall(3)||isItSmall(7)) { // || operator evaluates if either of the operand is true and if first condition is true it will not look out for second condition
			System.out.println("Result is true");
		}
		if(isItSmall(6)||isItSmall(9)) {
			System.out.println("Result is true");
		}
	}
	public static boolean isItSmall(int i) {
		if(i<5) {
			System.out.println("i<5");
			return true;
		}
		else {
			System.out.println("i>=5");
			return false;
		}
	}

}

// && and || operator works only with the boolean operands