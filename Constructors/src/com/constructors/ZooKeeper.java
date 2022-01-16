package com.constructors;

public class ZooKeeper {

	public static void main(String[] args) {
		new ZooKeeper().go();
		
	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name+m.makeNoise());
	}
}

//Polymorphism is applicable only for instance methods not instance variables