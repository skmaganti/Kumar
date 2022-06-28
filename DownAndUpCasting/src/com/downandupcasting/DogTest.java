package com.downandupcasting;

import java.io.FileNotFoundException;

public class DogTest {

	public static void main(String[] args) throws FileNotFoundException {
//		Animal a = new Animal();
//		Dog d = (Dog)a; //-- Downcasting compiles fine but fails later
		//String s = (String)a;
		
		Dog a = new Dog();
		Dog d = (Dog)a;
		a.doStuff();
//		d.Stuff(); //-- you can access stuff method from subclass when subclass is downcasted
		
		
//		Dog d = new Dog();
//		Animal a = d;
//		Animal a = (Animal)d;// -- Upcasting with explicit cast
//		a.parentStuff();
	}

}
