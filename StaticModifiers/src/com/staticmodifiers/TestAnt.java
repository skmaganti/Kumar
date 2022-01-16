package com.staticmodifiers;

public class TestAnt {

	public static void main(String[] args) {
		new Ant();
		new Ant();
		new Ant();
		System.out.println("from static " + Ant.getCount());
		new Ant();
		
		new TestAnt().go();
		Ant a = new Ant();
		System.out.println("use ref var " + a.getCount());
	}

	void go() {
		System.out.println("from instance " + Ant.getCount());
	}

}

//method cannot be static if there is instance variables inside the method