package com.stringbuffer;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);//Empty object is created with 5 capacity
		String s = ""; //Empty object is created again
		if(sb.equals(s)) {
			System.out.println("Match");
		} else if(sb.toString().equals(s.toString())) { //Converted to string here so content comparison works
			System.out.println("Match2");
		} else {
			System.out.println("No Match");
		}
	}

}
//Equals method is overridden in string class for content comparison but for StringBuffer/StringBuilder Equals method is not overridden for content comparison