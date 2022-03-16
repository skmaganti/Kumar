package com.strings;

public class StringCase3 {

	public static void main(String[] args) {
		String s1 = new String("Satish"); //Whenever new operator is there compulsory one object will be created in heap area
		String s2 = new String("Satish");
		String s3 = "Satish";
		String s4 = "Satish";
	}

}

// //S1 has two objects created in heap and SCP. 
//For s2 one object is created in heap and object will not create in SCP for s2 since s2 points to SCP already created object
//s3 refers to SCP object already created
//s4 refers to SCP object already created