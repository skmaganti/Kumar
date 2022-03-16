package com.employeecomparator;

import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Satish", 400);
		Employee e2 = new Employee("Kumar", 200);
		Employee e3 = new Employee("Maganti", 300);
		Employee e4 = new Employee("Kumar", 100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);

		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);

	}

}
