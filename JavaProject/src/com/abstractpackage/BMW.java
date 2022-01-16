package com.abstractpackage;

public class BMW extends Car{

	@Override
	public void goFast() {
		System.out.println("Going Fast");
	}

	@Override
	public void goUpHill() {
		System.out.println("Going up");
	}

	@Override
	public void impressNeighbors() {
		System.out.println("Impressed");
	}
	
	@Override
	public void takeRide() {
		System.out.println("Ride is on in sub class");
	}
	
}
