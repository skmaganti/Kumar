package com.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60));
		weights.remove(50.5);
		double first = weights.get(0);
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0); //Nullpointerexception
		System.out.println(h);
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);
	}

}
