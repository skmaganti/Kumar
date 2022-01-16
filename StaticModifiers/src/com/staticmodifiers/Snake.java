package com.staticmodifiers;

public class Snake {
	int snakeSize = 0;
	public int getSnakeSize() {
		return snakeSize;
	}
	
	public Snake(int s) {
		snakeSize = s;
	}
	public static void main(String[] args) {
		Snake s = new Snake(25);
		System.out.println(s.getSnakeSize());
	}
}
