package com.javaoperators;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		int sizeOfYard = 10;
		int numOfPets = 5;
		String status = (numOfPets<4)?"Pet Count OK":(sizeOfYard>8)?"Pet Limit on the edge":"Too many pets";
		System.out.println("Pet Status is: "+status);
	}

}
