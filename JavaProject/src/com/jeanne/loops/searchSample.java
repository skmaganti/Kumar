package com.jeanne.loops;

public class searchSample {

	public static void main(String[] args) {
		int[][] list = { { 1, 3, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 7;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}

			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println(searchValue + " not found");
		} else {
			System.out.println(searchValue + " found at " + positionX + " " + positionY);
		}

	}

}
