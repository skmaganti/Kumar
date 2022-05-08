package com.practicefromchapter3;

public class Review8 {

	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1,2).length();
		total += letters.substring(6,6).length();
		total += letters.substring(6,5).length(); //Java does not allow the indexes to be specified in reverse order and the code throws a StringIndexOutOfBoundsException.
		System.out.println(total);
	}

}
