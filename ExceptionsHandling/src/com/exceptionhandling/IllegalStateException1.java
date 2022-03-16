package com.exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateException1 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			//Object obj = itr.next(); //when this line is removed we get illegalstateexception
			itr.remove();
		}
		System.out.println(l);
	}

}
