package com.strings;

public class StringCount {

	public static void main(String[] args) {
		String s = "Welcome To Infosys";
		String upperCase = "";
		String lowerCase = "";
		for(int i = 0;i < s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch < 90)
				upperCase = upperCase + ch;
			else
				lowerCase = lowerCase + ch;			
		}
		
		System.out.println(upperCase);
		System.out.println(upperCase.length());
		System.out.println(lowerCase);
		System.out.println(lowerCase.length());
		
		
	}

}
