package com.decisionstatements;

public class SwitchCaseIllegal {

	public static void main(String[] args) {
		int temp = 90;
		byte g = 2;
		switch(temp) {
		case 89:
			System.out.println("89");
			break;
		case 90:
			System.out.println("90");
			break;
		//case 90: wont' compile since case 90 is already defined
			//System.out.println("90 again");
		}
		
		switch(g) {
		case 23:
		//case 128: possible loss of precision
		}
	}

}
