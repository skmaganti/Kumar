package com.jeanne.decisionmaking;

public class Sorting {
	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Kumar";
		final String suffix = "Mr";
		int id = 0;
		switch(firstName) {
		case "Test":
			System.out.println("Test Print");
		case suffix:
			id = 0;
			break;
		}
		return id;
	}
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.getSortOrder("Test", "Maganti");
	}

}
