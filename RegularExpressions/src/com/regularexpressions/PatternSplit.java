package com.regularexpressions;

import java.util.regex.Pattern;

public class PatternSplit {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\."); // we can use \\. or [.]
		String[] s = p.split("www.google.com");
		for(String s1:s) {
			System.out.println(s1);
		}
	}

}
//output values are tokens
//program can try with //s or "g" etc.,