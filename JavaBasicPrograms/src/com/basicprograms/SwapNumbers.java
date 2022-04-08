package com.basicprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		System.out.println("Before swap "+a+"..."+b);
		a = a+b; //60
		b = a-b; //20
		a = a-b; //40
		System.out.println("After swap "+a+"..."+b);
	}

}
