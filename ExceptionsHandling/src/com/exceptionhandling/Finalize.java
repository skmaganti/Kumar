package com.exceptionhandling;

public class Finalize {
	public void finalize() throws Throwable{
		System.out.println("Object garbage collected");
	}

	public static void main(String[] args) {
		Finalize f = new Finalize();
		f = null;
		System.gc();
	}

}
