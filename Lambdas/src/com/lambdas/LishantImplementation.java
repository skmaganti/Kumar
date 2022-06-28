package com.lambdas;

public class LishantImplementation implements Lishant<String, String>{

	@Override
	public String test(String t) {
		if(t.toUpperCase().startsWith("S")) {
			return "String starting with s";
		}
		return "String does not start with s";
	}

}
