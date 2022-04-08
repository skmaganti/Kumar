package com.jeanne.fieldandmethods;

import java.util.ArrayList;

public class MethodClass {
	public void method(ArrayList list) {
		if(list.isEmpty()) {
			System.out.println("e");
		} else {
			System.out.println("n");
		}
	}
	public static void main(String[] args) {
		MethodClass m = new MethodClass();
		m.method(null);
	}

}
