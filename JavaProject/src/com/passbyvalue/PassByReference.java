package com.passbyvalue;

public class PassByReference {
		int reference;
	public static void main(String[] args) {
		PassByReference pr = new PassByReference();
		pr.reference = 2;
		referenceMethod(pr);
		System.out.println(pr.reference);
	}
	
	public static void referenceMethod(PassByReference referenceObj) {
		referenceObj.reference = 40;
	}

}
