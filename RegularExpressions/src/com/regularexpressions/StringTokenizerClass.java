package com.regularexpressions;
import java.util.*;
public class StringTokenizerClass {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("satish kumar");
		StringTokenizer st1 = new StringTokenizer("27-03-2022", "-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
	}

}
//default pattern is space