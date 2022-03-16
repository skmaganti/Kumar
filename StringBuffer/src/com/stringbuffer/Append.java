package com.stringbuffer;

public class Append {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("PI value is ");
		sb.append(3.14);
		sb.append(" Its value is ");
		sb.append(true);
		System.out.println(sb);
	}

}
