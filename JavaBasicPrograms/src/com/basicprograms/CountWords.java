package com.basicprograms;

public class CountWords {
	public static int countWordsUsingSplit(String input) {
		if(input==null||input.isEmpty()) {
			return 0;
		}
		String[] words = input.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		System.out.println(countWordsUsingSplit("hello this is is satish"));
	}

}
