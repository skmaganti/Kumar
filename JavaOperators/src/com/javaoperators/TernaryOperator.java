package com.javaoperators;

public class TernaryOperator {

	public static void main(String[] args) {
		int numOfPets = 3;
		String status = (numOfPets<4)?"Number of pets not exceeded":"Too many pets";
		System.out.println("Pet Status: "+status);
	}

}
