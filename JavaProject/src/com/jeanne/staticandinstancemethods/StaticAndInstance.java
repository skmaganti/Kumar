package com.jeanne.staticandinstancemethods;

import com.importstatic.ImportStatic;

public class StaticAndInstance {
	private String name = "Static class";
	public static void first() {}
	public static void second() {}
	public static void third() {
//		System.out.println(name); //does not compile
	}
	public static void main(String[] args) {
		first();
		second();
		third();
	}

}
