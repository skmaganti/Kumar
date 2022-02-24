package com.strings;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		try {
		String valString = rs.reverseStr("satish");
		System.out.println(valString);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public String reverseStr(String s) {
		String reverseStr = "";
		for(int i = s.length()-1;i>=0;--i) {
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}
}
