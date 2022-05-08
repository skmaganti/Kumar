package com.practicefromchapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,4,-1,15); //creates fixed size array
		Collections.sort(list);
		System.out.println(list);
		Integer array[] = list.toArray(new Integer[4]); //converts back to array
		System.out.println(array[0]);		
	}

}
