package com.javaoperators;

public class ExclusiveOR {

	public static void main(String[] args) {
		System.out.println("xor "+((2<3)^(3<4)));
		boolean t = true;
		boolean f = false;
		System.out.println("! "+(t&!f)+" "+f);
	}

}
