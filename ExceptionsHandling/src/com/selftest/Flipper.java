package com.selftest;

public class Flipper {

	public static void main(String[] args) {
		String o = "_";
		switch("RED".toLowerCase()) {
		case "yellow":
			o += "y";
		case "red":
			o += "r";
		case "green":
			o += "g";
		}
		System.out.println(o);
	}

}
