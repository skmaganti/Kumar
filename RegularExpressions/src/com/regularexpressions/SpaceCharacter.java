package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceCharacter {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s"); //space character notation(\s) only but another back slash should be used
		Matcher m = p.matcher("a7b d3$");
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}

}
