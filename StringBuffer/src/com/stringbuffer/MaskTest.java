package com.stringbuffer;

public class MaskTest {
	public static String mask(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
//		return x+creditCard.substring(15,19);
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(mask("1234-5678-9012-3456"));
	}

}
