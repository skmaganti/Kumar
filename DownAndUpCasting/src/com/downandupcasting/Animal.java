package com.downandupcasting;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Animal {
	Object doStuff() throws IOException{
		System.out.println("Parent doStuff");
		return null;
	}
	
	void parentStuff() {
		System.out.println("Parent additional ");
	}
}
