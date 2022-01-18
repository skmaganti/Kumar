package com.arrays;

public class Student {
	public static void main(String[] args) {
		Student[] s = new Student[1000];
		s[0] = new Student();
//		s[1] = new Customer(); -- This statement is wrong
		Object[] o = new Object[1000];
		o[0] = new Student();		
	}
}
