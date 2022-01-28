package com.primitiveinstancevariables;

public class BirthDate {
	int year;
	public static void main(String[] args) {
		BirthDate bd = new BirthDate();
		bd.showYear();
	}
	
	public void showYear() {
		System.out.println("The year is "+year);
	}

}

// Default Values
//Object reference is null
//byte, short, int, long is 0
//float, double is 0.0
//char is '\u0000'