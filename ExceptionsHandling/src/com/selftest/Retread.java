package com.selftest;

public class Retread extends Tire{

	public static void main(String[] args){
		new Retread().doStuff();
	}
	@Override
	void doStuff() throws RuntimeException{
		System.out.println("Retread doStuff");
		System.out.println(7/0);
	}
}
