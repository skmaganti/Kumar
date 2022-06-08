package com.chapterfourreviewexercise;

public class Ropee {
	public static void swing() {
		System.out.println("swing");
	}
	public void climb() {
		System.out.println("climb");
	}
	public static void play() {
		swing();
//		climb();
	}
	public static void main(String[] args) {
		Ropee rope = new Ropee();
		rope.play();
		Ropee rope1 = null;
		rope1.play();		
	}

}
