package com.java8features;

@FunctionalInterface
public interface FunctionalInterfaceClass {
	public void m1();
	default void m2() {};
	public static void m3() {};
}
//Functional interface must contain only one abstract method but any number of static and default methods are acceptable