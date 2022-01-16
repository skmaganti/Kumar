package com.interfacepackage;

public interface Bounceable {
	public int x=1;
	int y=1;
	static int z=1;
	final int b =2;
	void Bounce();
	void setBounceFactor(int bf);
	
	//compiler by default consider all interface methods as public and abstract
}
