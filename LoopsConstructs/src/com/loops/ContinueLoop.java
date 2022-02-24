package com.loops;

public class ContinueLoop {

	public static void main(String[] args) {
		for(int i = 0;i < 10; i++) {
			System.out.println("Inside Loop "+i);
			if(i==5) {
			System.out.println("Reached continue");
			//break;
			continue;
			}
		}
	}

}
