package com.decisionstatements;

public class SwitchCaseBoxing {

	public static void main(String[] args) {
		switch(new Integer(4)) {
		case 4:
			System.out.println("boxing is fine");
		}
	}

}
