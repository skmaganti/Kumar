package com.abstractpackage;

abstract class Car {
	private double price;
	private String model;
	private String year;
	public abstract void goFast();
	public abstract void goUpHill();
	public abstract void impressNeighbors();
	//abstract class cannot have final
	public void takeRide() {
		System.out.println("Ride is on");
	}
}
