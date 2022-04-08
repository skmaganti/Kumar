package com.jeanne.fieldandmethods;

public class Animal {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("Satish");
		System.out.println(a.getName());
		
	}
	
}
