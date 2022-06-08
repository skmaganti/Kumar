package com.exceptions;

public class Index {
	int numberEggs;
	public int indexOf(String[] names, String name) {
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name))
				return i;
		}
		return -1;
	}
	
	public void setNumberEggs(int numberEggs) {
		if(numberEggs<0) throw new IllegalArgumentException("eggs must not be negative");
			this.numberEggs = numberEggs;
	}
	public static void main(String[] args) {
	
	}

}
