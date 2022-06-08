package com.jeanne.staticandinstancemethods;

public class KoalaClass {

	public static void main(String[] args) {
		Koala k = new Koala();
		System.out.println(k.count);
		k = null;
		System.out.println(k.count);
		Koala.count = 4;
		Koala k1 = new Koala();
		Koala k2 = new Koala();
		k1.count = 5;
		k1.count = 6;
		System.out.println(Koala.count);
	}

}
