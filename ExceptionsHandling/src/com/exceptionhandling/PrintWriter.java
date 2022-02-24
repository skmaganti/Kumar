package com.exceptionhandling;
import java.io.*;

public class PrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.PrintWriter pw = new java.io.PrintWriter("abc.txt"); //compiler may assume the file is not found and hence exception should be handled
		pw.println("Hello");
	}

}
