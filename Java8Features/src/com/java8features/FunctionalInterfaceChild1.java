package com.java8features;

public interface FunctionalInterfaceChild1 extends FunctionalInterfaceParent{
	public void m2();
	public void m3();
}
//If child class does not have functional interface annotation then child class acts as normal interface and in this case multiple abstract methods are allowed