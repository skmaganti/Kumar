package com.exceptionhandling;

public class ClassCastException {

	public static void main(String[] args) {
		//String s = new String("Satish");
		//Object o = (Object)s; //Casting to parent is fine but reverse way it fails
		//System.out.println(o);
		Object o = new Object(); //object to string type casting is not acceptable
		String s =(String)o;
		System.out.println(s);
		
//		Object ob = new String("Kumar"); //parent reference can be used to hold child object
//		String st = (String)ob;
//		System.out.println(st); // This is valid
	}

}
