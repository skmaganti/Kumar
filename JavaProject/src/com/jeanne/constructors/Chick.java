package com.jeanne.constructors;

public class Chick {
	public void Chick() {
		System.out.println("Not a constructor");
	}
	public static void main(String[] args) {
		Chick c = new Chick();
		c.Chick();
	}

}
