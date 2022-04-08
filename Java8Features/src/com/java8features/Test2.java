package com.java8features;

public class Test2 {

	public static void main(String[] args) {
		Interface2 i = n->n*n;
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(6));
	}

}
