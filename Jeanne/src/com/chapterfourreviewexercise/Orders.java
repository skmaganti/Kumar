package com.chapterfourreviewexercise;

public class Orders {
	String value = "t";
	{
		value += "a";
	}
	{
		value += "c";
	}

	public Orders() {
		value += "b";
	}

	public Orders(String s) {
		value += s;
	}

	public static void main(String[] args) {
		Orders orders = new Orders("f");
		orders = new Orders();
		System.out.println(orders.value);
	}

}
