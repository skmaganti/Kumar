package com.strings;

public class StringCase4 {

	public static void main(String[] args) {
		String s = new String("Satish"); // one object in heap(Satish) and one object in SCP(Satish)
		s.concat("Kumar"); // one object in SCP(Kumar). 'SatishKumar' is eligible for GC
		s = s.concat("Maganti"); //one object in SCP(Maganti) and one object in Heap(SatishMaganti). 'Satish' is elgible for GC
	}

}
