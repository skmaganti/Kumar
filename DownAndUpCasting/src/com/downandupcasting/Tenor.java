package com.downandupcasting;

public class Tenor extends Singer{
	public static String sing() {
		return "fa";
	}
	
public static void main(String[] args) {
	Tenor t = new Tenor();
	Singer s = new Tenor();
	System.out.println(s.sing()+" "+s.sing());
}
}
