package com.passingobjectrefvariables;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
		Dimension d = new Dimension(5,10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before d.height " +d.height);
		rt.modify(d);
		System.out.println("After d.height"+d.height);			
		}
	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim = "+dim.height);
	}
	}
//when you pass an object variable into a method, that means you are passing an object reference not the actual
//object itself