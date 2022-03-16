package com.arrays;

public class ArrayVariableAssignments {

	public static void main(String[] args) {
		int[] x = {10,20,30};
		int[] b = x;
		System.out.println(b[1]);
		char[] ch = {'a','b','c','d'};
		//int[] c = ch; Element level promotion is not applicable at array level
		char[] c = ch;
		System.out.println(c[0]);
		
		String[] s = {"A","B","C"};
		Object[] o = s; //String array can be promoted to object array
		
		int[] e = {10,20,30,40};
		int[] f = {50,60};
		e = f; //Internal elements are not copied only reference variables will be reassigned
		f = e;
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(e[1]);
		
		int[][] g = new int[3][];
		//g[0] = new int[4][3]; //cannot convert 2 dimension to one dimension
		//g[1] = 10; //cannot convert one dimension to int
		g[0] = new int[2];
		
	}

}

//char element can be promoted to int type whereas char array cannot be promoted to int array
//Whenever we are assigning one array to another array dimensions must be matched

//both dimensions and types must be matched but sizes are not requried to match when we are assigning one array to another