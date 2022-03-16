package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample1 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){ //syntax: try(R){} Here resources are closed automatically. Complexity of the program will be reduced
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

}
}
