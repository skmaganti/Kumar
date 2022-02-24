package com.javaoperators;

public class NonShortCircuitLogicalOperators {

	public static void main(String[] args) {
		int z = 5;
		if((++z>5)||(++z<6))
			z++;
		System.out.println(z);
		
		int z1 = 5;
		if((++z1>5)|(++z1<6))
			z1++;
		System.out.println(z1);
		
	}

}
