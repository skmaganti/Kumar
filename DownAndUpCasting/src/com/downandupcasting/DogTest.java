package com.downandupcasting;

public class DogTest {

	public static void main(String[] args) {
		//Animal a = new Animal();
		//Dog d = (Dog)a; -- Downcasting compiles fine but fails later
		//String s = (Stirng)a;
		
		Animal a = new Dog();
		Dog d = (Dog)a;
		//d.Stuff(); -- you can access stuff method from subclass when subclass is downcasted
		
		
		//Dog d = new Dog();
		//Animal a = d;
		//Animal a = (Animal)d; -- Upcasting with explicit cast
	}

}