package com.objectreferenceinstancevariables;

public class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		Book b = new Book();
		String s = b.getTitle();
		System.out.println("The title is " + b.getTitle());
		// s.toLowerCase(); run time error because reference variable title does not
		// point to any object

		if (s != null) {
			System.out.println(s.toLowerCase());
		}

	}
}

//Null value is not the same as empty string(""). A null value means the reference variable is not referring
//to any object in the heap