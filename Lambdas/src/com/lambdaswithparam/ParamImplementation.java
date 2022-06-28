package com.lambdaswithparam;

public class ParamImplementation implements ParamInterface<String,Integer>{

	@Override
	public void testAbstract(String s, Integer i) {
		i = i*100;
		s = s.toLowerCase();
		System.out.println(s);
		System.out.println(i);
	}

}
