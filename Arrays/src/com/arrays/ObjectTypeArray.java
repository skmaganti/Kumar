package com.arrays;

public class ObjectTypeArray {

	public static void main(String[] args) {
		Object[] a = new Object[10];
		a[0] = new Object();
		a[1] = new String("Satish");
		a[2] = new Integer(10);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		Number[] n = new Number[10];
		n[0] = new Integer(10); //Integer is child class of Number
		n[1] = new Double(10); //Double is child class of Number
		//n[2] = new String("Satish"); String is not child class of Number class
		
		Runnable[] r = new Runnable[10]; //Runnable type array object can be created. Runnable is interface(Interface object cannot be created but interface array can be created). Its implementation classes are allowed
		r[0] = new Thread();
		//r[1] = new String("Satish"); //String does not implement runnable interface
	}

}
