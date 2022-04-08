package com.jeanne.operators;
import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		File x = new File("text.txt");
		File y = new File("text.txt");
		File z = x;
		System.out.println(x == y);
		System.out.println(x == z);
	}

}
