package com.javaoperators;

public class BitWiseOperator {

	public static void main(String[] args) {
		System.out.println(true&true);//AND - returns true if both arguments are true
		System.out.println(true|false);// OR - returns true if at least one argument is true
		System.out.println(true^false);// X-OR/Exclusive OR - returns true if both arguments are different
		byte b1 = 6&8; //bitwise value of 6 is 110 & bitwise value of 8 is 1000: apply AND logic to both values i.e., 110 + 1000 = 0000 
		byte b2 = 7|9; //bitwise value of 7 is 111 | bitwise value of 9 is 1001. apply OR logic to both values i.e., 111 + 1001 =  1111
		byte b3 = 5^4; //bitwise value of 5 is 101 ^ bitwise value of 4 is 100. apply XOR logic to both values  i.e., 101 + 100 = 001
		System.out.println(b1+" "+b2+" "+b3);
		System.out.println(~4);// 32 bit value of 4 is 000.....0100(the most significant bit is signed since 4 is positive hence first value will stars with 0)
		// ~4 means in 32 bit value it is 111.......1011(since first value is 1 and it indicates negative now apply 2's compliment)
		// first apply one's complement i.e., 000......0100 + 1 => 0000.....0101 => 101 value is 5
}
}
