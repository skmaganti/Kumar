package com.constructorchaining;

public class ImmutableSwan {
	private int numberEggs;
	public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}
	public static void main(String[] args) {
		ImmutableSwan i = new ImmutableSwan(5);
		System.out.println(i.numberEggs);
	}

}
