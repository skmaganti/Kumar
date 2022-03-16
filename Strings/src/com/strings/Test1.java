package com.strings;

public class Test1 {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Satish");
		sb.append("Kumar"); //Although final is declared immutability concept is not acheived
		System.out.println(sb);
		//sb = new StringBuffer("Maganti"); cannot assign a value to final variable
	}

}

//If we don't want to perform any changes to the object then it is immutability
//If we don't want to perform any changes to the variable then it is final