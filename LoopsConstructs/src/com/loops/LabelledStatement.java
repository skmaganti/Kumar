package com.loops;

public class LabelledStatement {

	public static void main(String[] args) {
		boolean isTrue = true;
		outer:
			for(int i=0;i<5;i++) {
				while(isTrue) {
					System.out.println("Hello");
					break outer;
				}
				System.out.println("Outer Loop");//Since labelled statement is applied this statement will not print
			}
		System.out.println("Good-Bye");
	}

}
