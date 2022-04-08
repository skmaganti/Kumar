package com.jeanne.localmethodvariables;

public class FindAnswer {
	public void findTheAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if(check) {
			onlyOneBranch = 1;
			answer = 1;
		} else
			answer = 2;
		System.out.println(answer);
//		System.out.println(onlyOneBranch); //onlyOneBranch is not initialized in else condition and hence it gives compile time error
	}
}
