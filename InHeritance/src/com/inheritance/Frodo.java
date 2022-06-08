package com.inheritance;

public class Frodo extends Hobbit{

	public static void main(String[] args) {
		int myGold = 7;
		Hobbit f = new Frodo();
		System.out.println(f.countGold(myGold,6));
	}

}
