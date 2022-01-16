package com.defaultinterface;

public interface DefaultInterfaceClass {
	default int m1() {
		return 2;
	}
	public abstract void abs();
}
