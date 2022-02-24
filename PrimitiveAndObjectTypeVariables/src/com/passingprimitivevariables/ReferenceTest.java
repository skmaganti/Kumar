package com.passingprimitivevariables;

public class ReferenceTest {

	public static void main(String[] args) {
		int a = 1;
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before "+a);
		rt.modify(a);
		System.out.println("After "+a);
	}
	void modify(int number) {
		number = number + 1;
		System.out.println("number "+number);
	}

}
//Value of a is not changed after it was passed to a method because primitive variable is passed by value