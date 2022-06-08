package com.chapterfourreviewexercise;

public class Cheetah {
	int numSpots;
	public Cheetah(int numSpots) {
		this.numSpots = numSpots;
	}
	public static void main(String[] args) {
		Cheetah c = new Cheetah(50);
		System.out.println(c.numSpots);
		System.out.println(new Cheetah(50).numSpots);
		
	}

}
