package com.inteface;

public class Bear implements Herbivore, Omnivore{

	@Override
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	@Override
	public void eatPlants() {
		System.out.println("Eating plants");
	}
	
	public static void main(String[] args) {
		Bear b = new Bear();
		b.eatMeat();
		b.eatPlants();
	}
	
}
