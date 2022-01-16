package com.interfacepackage;

public class Tire implements Bounceable{

	@Override
	public void Bounce() {
		System.out.println("Bouncing");
	}

	@Override
	public void setBounceFactor(int bf) {
		System.out.println("Bouncing Ratio is "+bf);
	}
}
	//All interface methods must be public and implemented
	//Interface has only abstract methods
	//All variables declared in interface must be public, static and final
	//Interface can declare only constants not instance variables
	//Interface methods cannot be marked as final, strictfp or native
	//An Interface can extend another interface but cannot be implemented. Class implements interface
	//Interfaces are implicitly abstract
	//Interface methods are always public
	//Class can implement more than one interface and legal
	//Interface can extend multiple interfaces
	//A class can extend and also implement an interface
