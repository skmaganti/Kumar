package com.jeanne.localmethodvariables;

public class Mouse {
	static int MAX_LENGTH = 5;
	int length;
	
	public void grow(int inches) {
		if(length<MAX_LENGTH) {
			int newSize = length + inches;
			length = newSize;
			System.out.println(newSize);
		}
	}
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.grow(3);
	}

}
