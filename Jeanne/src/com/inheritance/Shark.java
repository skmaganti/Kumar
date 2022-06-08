package com.inheritance;

public class Shark extends Fish{
	private int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	
	public void displaySharkDetails() {
		System.out.print("Shark with age: "+getAge()); //or this.getAge() or super.getAge()
		System.out.print(" and "+size+" meters long");
		System.out.print(" with "+numberOfFins+" fins");
	}
	public static void main(String[] args) {
		Shark s = new Shark(10);
		s.displaySharkDetails();
	}

}
