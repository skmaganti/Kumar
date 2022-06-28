package com.lambdaswithparam;

public class ParamImplementation implements ParamInterface<String,Integer>{

	@Override
	public void testAbstract(String s, Integer i) {
		i = s.length(); 
		System.out.println(i);
	}

}
