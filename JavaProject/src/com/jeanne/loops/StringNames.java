package com.jeanne.loops;

import java.util.ArrayList;
import java.util.List;

public class StringNames {

	public static void main(String[] args) {
//		final String[] names = new String[3];
//		names[0] = "Lisa";
//		names[1] = "Kevin";
//		names[2] = "Roger";
		List<String> names = new ArrayList<String>();
		names.add("Lisa");
		names.add("Kevin");
		names.add("Roger");
//		for(String name:names) {
//			System.out.print(name+" ");
//		}
		for(int i = 0; i <names.size(); i++) {
			String name = names.get(i);
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}
	}

}
