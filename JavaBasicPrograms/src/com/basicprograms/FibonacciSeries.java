package com.basicprograms;

public class FibonacciSeries {
	static int fib(int n) { //Function to return sum of previous two numbers
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		int fibValue = 10;
		for(int i = 0; i<fibValue;i++) {
			System.out.println(fib(i)+"");
		}
	}

}
