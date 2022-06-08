package com.constructorchaining;

public class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	public Mouse(int weight) {
		this(weight,16);
	}
	
	public Mouse(int weight, int numTeeth) {
		this(weight,numTeeth,16);
	}
	
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}
	
	public void print() {
		System.out.println(weight+" "+numTeeth+" "+numWhiskers);
	}
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse(5);
		mouse.print();
	}

}
