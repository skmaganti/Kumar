package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample2 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("input.txt");FileReader pw = new FileReader("output.txt")){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
;		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//try(R1;R2;R3){} Resources should be separated with semi-colon. Resources should be auto closable