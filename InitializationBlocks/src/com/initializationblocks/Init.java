package com.initializationblocks;

public class Init {
	Init(int x){
		System.out.println("one arg constrcutor");
	}
	Init(){
		System.out.println("No arg constructor");
	}
	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	
	static {
		System.out.println("2nd static init");
	}
	
	public static void main(String[] args) {
		new Init();
		new Init(7);
	}
}
