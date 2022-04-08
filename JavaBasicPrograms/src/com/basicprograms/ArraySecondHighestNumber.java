package com.basicprograms;

import java.util.Arrays;

public class ArraySecondHighestNumber {
	public static int findSecondLargestNumber(int array[]) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for(int i = 0;i<array.length;i++) {
			if(array[i]>highest) {
				secondHighest = highest;
				highest = array[i];
			}
			else if(array[i]>secondHighest&&array[i]!=highest)
				secondHighest = array[i];
		}
		return secondHighest;
	}
	
	public static void main(String[] args) {
		int arrayVal[] = {5,4,1,2,6};
		int arrValue = findSecondLargestNumber(arrayVal);
		System.out.println(arrValue);
	}

}
