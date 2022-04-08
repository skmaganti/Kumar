package com.java8features;

@FunctionalInterface
public interface FunctionalInterfaceChild extends FunctionalInterfaceParent{
	//public void m1();

}
//child interface if it does not have abstract method also it is fine because parent abstract method will be called in child interface
//if child class has abstract method then also fine because it overrides parent class method

