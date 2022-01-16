package com.heapandstack;

public class Dog {
	Collar c;
	static int a = 23_234;
	String name;
		
	public static void main(String[] args) {
		int dec = 42;
		String bin = Integer.toBinaryString(dec);
		System.out.println(bin);
		System.out.println(a);
		Dog d;
		d = new Dog();
		d.go(d);	
	}
	void go(Dog dog) {
		c = new Collar();
		dog.setName("Aiko");
	}
	void setName(String dogName) {
		name = dogName;
		
	}
}

//Instance variables and objects live on the heap.
//Local variables live on the stack.
