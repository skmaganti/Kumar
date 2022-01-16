package com.instancevariablename;

public class TestServer {
	int count = 10;
	public void logIn() {
		int count = 9;
		System.out.println("Local variable count is "+count);
	}
	
	public void count() {
		System.out.println("Instance variable count is "+count);
	}

	public static void main(String[] args) {
		new TestServer().logIn();
		new TestServer().count();		
	}

}
