package com.overloadingmethods;

public class Sample {
	public static void play(Long...l) {} //Long is a wrapper class
	public static void main(String[] args) {
//		play(4); //Does not compile
		play(4L);
	}
}
