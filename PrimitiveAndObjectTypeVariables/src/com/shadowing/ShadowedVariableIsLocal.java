package com.shadowing;

public class ShadowedVariableIsLocal {
	static int size = 7;
	static void changeIt(int size) {
		size = size+200;
		System.out.println("size in changeIt is "+size);
	}
	public static void main(String[] args) {
		ShadowedVariableIsLocal f= new ShadowedVariableIsLocal();
		System.out.println("Size "+size);
		changeIt(size);
		System.out.println("Size after changeIt is "+size);
	}

}
//Because changeIt has a method parameter named size, the local size variable is modified but static size is untouched