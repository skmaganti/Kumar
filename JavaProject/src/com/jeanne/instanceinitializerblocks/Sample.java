package com.jeanne.instanceinitializerblocks;

public class Sample {
	{System.out.println("Snowy");}
	public static void main(String[] args) {
		Sample s = new Sample();
		{System.out.println("Feathers");}
	}
	
	

}
