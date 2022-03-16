package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(args[0]);
		if(m.find()&&m.group().equals(args[0])) {
			System.out.println("Valid mobile number");
		}
		else
		{
			System.out.println("Invalid mobile number");
		}
		
	}

}
