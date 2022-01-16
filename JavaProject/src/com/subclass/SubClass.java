package com.subclass;

import com.superpackage.SuperClass;

public class SubClass extends SuperClass{

	public static void main(String[] args) {
		System.out.println("Sub Class");
		SuperClass sc = new SubClass();
		sc.main(args);
	}

}
