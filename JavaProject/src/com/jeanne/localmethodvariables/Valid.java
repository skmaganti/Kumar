package com.jeanne.localmethodvariables;

public class Valid {
	public int checkValid() {
		int y = 10;
		int x; //declared
		x = 3; //initialized
		int reply = x+y;
		return reply;
	}
	public static void main(String[] args) {
		Valid v = new Valid();
		System.out.println(v.checkValid());
	}

}
