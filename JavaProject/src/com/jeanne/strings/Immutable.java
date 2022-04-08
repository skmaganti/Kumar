package com.jeanne.strings;

public class Immutable {
	private String s = "name";
	public String getS() {
		return s;
	}
	
	public void main(String[] args) {
		Mutable m = new Mutable();
		Immutable i = new Immutable();
//		System.out.println(m.getS());
		System.out.println(i.getS());
	}
}
