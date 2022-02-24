package com.loops;

public class LabelledWhileExcercise {

	public static void main(String[] args) {
		int age = 1;
		outer:
			while(age<=21) {
				age++;
				if(age==16) {
					System.out.println("get your driver's license");
					continue;
				}
				
			}
		System.out.println("Another year");
	}

}
