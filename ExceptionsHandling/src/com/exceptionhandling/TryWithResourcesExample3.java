package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileReader fr = new FileReader("input.txt")){
			//fr = new FileReader("input1.txt"); Reference variable cannot be reassigned
		}
	}

}
// All resource reference variables are implicitly final. We cannot reassign it again
// From 1.7 version, only try is possible
//Declaration of resource object should be in try block only up to 1.8v