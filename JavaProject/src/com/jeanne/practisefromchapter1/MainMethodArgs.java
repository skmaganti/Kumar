package com.jeanne.practisefromchapter1;

public class MainMethodArgs {
	int i1 = 1_234;
//	double d1 = 1_234_.0;
//	double d2 = 1_234._0;
//	double d3 = _1_234.0_;
//	double d4 = 1000.00_;
	
	public void admission() {
//		int amount = 9L; invalid
		int amount = 0b101; //valid 1*2+0*2+1*2
//		int amount = 0xE; valid
//		double amount = 1_2_.0_0; invalid
//		int amount = 1_2_; invalid
		
		System.out.println(amount);
	}
	
	public static void main(String maganti[]) {
		MainMethodArgs mma = new MainMethodArgs();
		mma.admission();
	}

}
