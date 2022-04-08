package com.jeanne;

public class Cougar extends Puma{

	public static void main(String[] args) {
		Puma puma = new Cougar();
		System.out.println(puma.getTailLength());
	}
	
	@Override
	public int getTailLength() {
		return 2;
	}

}
