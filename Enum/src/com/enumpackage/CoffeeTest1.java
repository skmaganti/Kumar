package com.enumpackage;

enum CoffeeSize {BIG, HUGE, LARGE};

class Coffee {
	
	CoffeeSize size;
}

public class CoffeeTest1 {
	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG;
	}

}
