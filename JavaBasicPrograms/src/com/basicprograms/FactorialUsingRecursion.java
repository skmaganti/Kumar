package com.basicprograms;

public class FactorialUsingRecursion {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		long fact = factorial(91);
		System.out.println(fact);
	}

}
