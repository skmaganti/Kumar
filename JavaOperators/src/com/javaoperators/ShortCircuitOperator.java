package com.javaoperators;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		if((2<3)&&(3<4)) { // returns true only if both the conditions are true
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		boolean b1 = false, b2 = false;
		boolean b3 = (b1==true) && (b2=true); // b2=true never runs because first statement is already false
		System.out.println(b3 + " "+b2);
			
	}

}
