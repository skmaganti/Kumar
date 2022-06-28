package com.lambdas;

public class TestLambda {

	public static void main(String[] args) {
		//Implementation with class
		Lishant<String,String> lishant = new LishantImplementation();
		String lishu = lishant.test("Satish");
		System.out.println(lishu);
		
		//Implementation with anonymous class
		Lishant<String,String> lishantAnonymousImplementation = new Lishant<String,String>(){

			@Override
			public String test(String t) {
				if(t.toUpperCase().startsWith("S")) {
					return "String starting with s";
				}
				return "String does not start with s";
			}
		};
		String lishu1 = lishantAnonymousImplementation.test("SATISH");
		System.out.println(lishu1);
		
		//Implementation with lambda logic
		Lishant<String,Integer> lishantLambda = s-> {
			return s.length();
			
		};
		System.out.println(lishantLambda.test("Satish"));
		
		//Implementation with lambda
		Lishant<String, String> lishantLambdaString = (s)->{
			return s.toLowerCase();
		};
		System.out.println(lishantLambdaString.test("SATISH"));
	}
}