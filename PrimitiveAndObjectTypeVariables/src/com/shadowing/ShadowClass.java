package com.shadowing;

public class ShadowClass {
	ShadowedVariableObjectRef myBar = new ShadowedVariableObjectRef();
	void changeIt(ShadowedVariableObjectRef myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is "+myBar.barNum);
		myBar = new ShadowedVariableObjectRef();
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now "+myBar.barNum);
	}
	public static void main(String[] args) {
		ShadowClass s = new ShadowClass();
		System.out.println("s.myBar.barNum is "+s.myBar.barNum);
		s.changeIt(s.myBar);
		System.out.println("s.myBar.barNum after changeIt is "+s.myBar.barNum);
		
	}

}
