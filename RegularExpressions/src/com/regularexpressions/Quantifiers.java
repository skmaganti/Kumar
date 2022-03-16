package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a?"); //space character notation(\s) only but another back slash should be used
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}

}