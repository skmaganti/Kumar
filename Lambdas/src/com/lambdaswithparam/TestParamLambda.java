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
					public void testAbstract(String p, Integer q) {
						q = p.length(); 
						System.out.println(q);
					}
				};
				paramAnonymousImplementation.testAbstract("SatishM", 1);
				
		//Implementation with lambda expression
				ParamInterface<String,Integer> paramLambdaExpression = (s,i)->System.out.println(s.length());
				paramLambdaExpression.testAbstract("SatishKumar", 2);
	}

}
