package com.jeanne;

public class Deer {
	public Deer() {
		System.out.println("Deer");
	}
	public Deer(int age) {
		System.out.println("DeerAge");
	}
	private boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println(","+deer.hasHorns());
	}
}
