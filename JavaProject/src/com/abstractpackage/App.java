package com.abstractpackage;

public class App {

	public static void main(String[] args) {
		Car c = new BMW();
		c.goFast();
		c.goUpHill();
		c.impressNeighbors();
		c.takeRide();
		BMW bmw = (BMW)c;
		bmw.takeRide();
		//Abstract class cannot be instantiated
		//Car car = new Car();
		//BMW bmw = new BMW();
		bmw.takeRide();
		bmw.goFast();
		
		Car car = c;
		car.takeRide();
	}

}
