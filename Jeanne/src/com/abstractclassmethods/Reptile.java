package com.abstractclassmethods;

abstract class Reptile {
	public void layEggs() {
		System.out.println("Reptile lay eggs");
	}
	public static void main(String[] args) {
		Reptile reptile = new Lizard();
		reptile.layEggs();
	}

}
