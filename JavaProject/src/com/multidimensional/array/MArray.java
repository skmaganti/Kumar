package com.multidimensional.array;

public class MArray {

	public static void main(String[] args) {
		int[][] i = new int[3][2];
//		for(int[] inner:i) {
//			for(int num:inner)
//			System.out.print(num+" ");
//			System.out.println();
//		}
		
		for(int a = 0;a<i.length;a++) {
//			System.out.println(i.length);
			for(int b = 0;b<i[a].length;b++) {
//				System.out.println(i[a].length);
				System.out.print(i[a][b]+" ");
			}
			System.out.println();
		}
	}

}
