package com.java8features;

public class Test1 {

	public static void main(String[] args) {
		Interface1 i = (a,b)->System.out.println("The sum value is: "+(a+b));
		i.add(10.0, 30);
		i.add(10, 20);
		i.add(20.5, 10);
	}

}
