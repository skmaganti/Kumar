package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee1 {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("kumar",401));
		l.add(new Employee("maganti",103));
		l.add(new Employee("lishant",300));
		System.out.println(l);
//		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0); //sorting based on employee number in ascending order
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name)); //sorting based on employee names
		System.out.println(l);
	}
}