package com.loops;

public class LegalAndIllegal {

	public static void main(String[] args) {
		int x = 1;
		// while (x) {}; //illegal
		//while (x=5) {}; //illegal
		while (x==5) {}
		while (true) {}
	}

}
