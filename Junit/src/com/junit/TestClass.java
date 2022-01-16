package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
	String str1 = "java";
	String str2 = "java";
	String str3 = new String(str1);
	String str4 = new String(str2);
	@Test
	public void test() {
		Assert.assertEquals(str1, str2);
	}
	@Test
	public void test2() {
		Assert.assertEquals(str2, str3);
	}
	@Test
	public void test3() {
		Assert.assertSame(str1, str2);
	}
	@Test
	public void test4() {
		Assert.assertSame(str3, str4);
	}
}