package com.staticmodifiers;

public class Ant {
	private static int antCount = 0;
	static int getCount() {
		return antCount;
	}
	
	public Ant() {
		antCount += 1;
	}
}
