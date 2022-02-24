package com.loops;

public class EnhancedLoopForObjectReference {

	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat()};
		for(Animal a:animals) {
			System.out.println(a);
		}
	}

}
