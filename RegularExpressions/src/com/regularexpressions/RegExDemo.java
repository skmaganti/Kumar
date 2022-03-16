package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("cha");
		Matcher m = p.matcher("chacha");
		while(m.find()) {
			count++;
			System.out.println("Pattern Index started from "+m.start()+ " Pattern Index ended at "+m.end()+" Pattern Group "+m.group());
		}
		System.out.println("Total number of occurences "+count);
	}

}
