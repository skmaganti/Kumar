package com.jeanne.constructors;

public class Chickens {
	int numEggs = 0;
	String name;
	public Chickens() {
		name = "Duke";
		System.out.println(name);
	}
	public static void main(String[] args) {
		new Chickens();
	}

}
