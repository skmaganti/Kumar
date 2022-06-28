package com.staticinterface;

public class TestSIF implements StaticIface{

	public static void main(String[] args) {
		System.out.println(StaticIface.m1());
		StaticClass sc = new StaticClass();
		sc.m2();
	}

}

//static interface methods must have a concrete body
//static interface methods cannot be marked as private,protected,final or abstract