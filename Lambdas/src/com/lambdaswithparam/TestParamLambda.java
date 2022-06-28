package com.lambdaswithparam;

import com.lambdas.Lishant;
import com.lambdas.LishantImplementation;

public class TestParamLambda {

	public static void main(String[] args) {
		//Implementation with class
				ParamInterface<String,Integer> paramInterface = new ParamImplementation();
				paramInterface.testAbstract("Satish", 2);	
				
		//Implementation with anonymous class
				ParamInterface<String,Integer> paramAnonymousImplementation = new ParamInterface<String, Integer>() {
					
					@Override
					public void testAbstract(String s, Integer i) {
						i = i*100;
						s = s.toLowerCase();
						System.out.println(s);
						System.out.println(i);
					}
				};
				paramAnonymousImplementation.testAbstract("SatishM", 1);
				
		//Implementation with lambda expression
				ParamInterface<String,Integer> paramLambdaExpression = (s,i)->{
					System.out.println(s.toLowerCase());
					System.out.println(i*100);
				};
				paramLambdaExpression.testAbstract("SatishKumar", 2);
	}

}
