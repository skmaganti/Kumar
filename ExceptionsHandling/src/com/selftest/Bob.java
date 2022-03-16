package com.selftest;

public class Bob {

	public static void main(String[] args) {
		String s = "bob";
		String[] sa = {"a", "bob"};
		final String s2 = "bob";
		StringBuilder sb = new StringBuilder("bob");
//		switch(sa[1]) { //case 1
//		case "ann":;
//		}
//		switch("b"+"ob") { //case 2
//		case s:;
//	}
		
		switch(sb.toString()) { //case 3
		case s2:;
		}
	}

}
