package com.jeanne.loops;

public class ArrayClass {

	public static void main(String[] args) {
		int[][] a= new int[4][5];
		for(int i =0;i<a.length;i++) {
			for(int j =0; j< a[i].length;j++) {
				int b = a[i][j];
				System.out.print(b+"\t");
			}
			System.out.println();
			
		}
		
	}

}
