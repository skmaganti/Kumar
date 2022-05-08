package com.jeanne.stringbuilder;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("fg").append("gh");
		System.out.println(a);
		System.out.println(b);
		String sub = b.substring(b.indexOf("c"),b.indexOf("gh"));
		int len = b.length();
		char ch = b.charAt(4);
		System.out.println(sub+" "+len+" "+ch);
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("+").append(true);
		System.out.println(sb);
		sb.insert(1, 'b');
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		sb.delete(0, 3);
		sb.deleteCharAt(4);
		System.out.println(sb);
		String s = new String("satish").concat("kumar");
		System.out.println(s);
		String sc = s.concat("m").concat("s").concat("k");
		System.out.println(s);
		System.out.println(sc);
		sb.setCharAt(3, 'a'); //replace
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb.capacity());
		sb.ensureCapacity(39);
		System.out.println(sb.capacity());
}
}
