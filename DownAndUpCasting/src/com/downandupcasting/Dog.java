package com.downandupcasting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dog extends Animal{
	
	String doStuff(){
		System.out.println("Child doStuff");
		return null;
	}
	
	void Stuff() {
		System.out.println("Another child stuff");
	}
}
