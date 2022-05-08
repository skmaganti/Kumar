package com.practicefromchapter3;

public class Review3 {

	public static void main(String[] args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
//		if(s1==s2) System.out.println("1"); java does not allow to compare string and stringbuilder
		if(s1.equals(s2))
			System.out.println("2");
	}

}
