package com.jeanne.staticandinstancemethods;

public class Gorilla {
	public static int count;
	public static void addGorilla() {
		count++;
	}
	public void babyGorilla() {
		count++;
	}
	
	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}
	public static void announceBabiesToEveryone() {
		addGorilla();
//		babyGorilla(); // does not compile because static method is trying to use an instance method
	}
	public int total;
//	public static average = total/count; // does not compile because static variable is trying to use an instance variable

}
