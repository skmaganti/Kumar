package com.exceptionhandling;

public class MultiCatchBlock1 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println(10/0);			
		}
		catch(ArithmeticException | NullPointerException e) { //multiple exceptions in catch block from 1.7v
			e.printStackTrace();
		}
	}

}
//In multicatch block there should not be any relation between parent to child or vice versa example catch(AE|E) -- Not Acceptable