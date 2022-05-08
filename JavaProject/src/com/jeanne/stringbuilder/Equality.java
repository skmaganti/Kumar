package com.jeanne.stringbuilder;

public class Equality {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("satish");
		StringBuilder sb1 = new StringBuilder("satish");
		StringBuilder sb2 = sb.append("kumar");
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		
		String x = "hello world";
		String y = "hello world";
		String z = " hello world".trim();
		System.out.println(x==y);
		System.out.println(x.equals(y));
		System.out.println(x==z);
		System.out.println(x.equals(z));
		
		String a = new String("kumar");
		String b = new String("kumar");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String c = new String("msk");
		String d = "msk";
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
	}

}
