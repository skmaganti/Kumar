package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(0);
		l.add(30);
		l.add(5);
		System.out.println(l);//displays numbers in insertion order
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0; //lambda expression
		Collections.sort(l,c);
		System.out.println(l); //display numbers in ascending order
	}

}
