package com.selftest;

public class McGee {
	enum Days {
		M, T, W, TH, F, SA, SU
	};

	public static void main(String[] args) {
		Days d1 = Days.TH;
		Days d2 = Days.M;
		for (Days d : Days.values()) {
				if (d.equals(Days.F)) {
				break;
			}
			d2 = d;			
		}
		System.out.println((d1 == d2) ? "same old" : "newly new");
	}

}
