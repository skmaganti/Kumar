package com.regularexpressions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleTextFiles {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$_.]*[.](txt|class)");
		File f = new File("D:\\JavaWorkspace");
		String[] s = f.list();
		int count = 0;
		for(String s1:s) {
			Matcher m = p.matcher(s1);
			if(m.find()&&m.group().equals(s1)) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}

}