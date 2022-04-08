package com.basicprograms;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input = "aabcccddbbaa";
		char search = 'b';
		int count = 0;
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)==search)
			count++;
		}
		System.out.println("The character "+search+" appears "+count+" times");
	}

}
