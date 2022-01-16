package com.initializationblocks;

public class Raptor extends Bird {
	static {
		System.out.println("r1");
	}

	public Raptor() {
		System.out.println("r2");
	}

	{
		System.out.println("r3");
	}

	static {
		System.out.println("r4");
	}
}

//Static blocks are called first followed (by instance blocks and then Constructor block)