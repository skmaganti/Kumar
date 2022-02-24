package com.decisionstatements;

public class DefaultCase {

	public static void main(String[] args) {
		String x = "someNumberBetweenOneandTen";
		switch(x) {
		case "one":
		default: System.out.println("Nothing matched");
		case "two":
		case "someNumberBetweenOneandTen":System.out.println("I am there"); break;
			
		}
		
	}

}
