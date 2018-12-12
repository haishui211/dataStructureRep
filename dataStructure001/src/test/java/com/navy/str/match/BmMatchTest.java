package com.navy.str.match;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BmMatchTest {
	
	@Test
	public void testT001() {
		String mainStr = "abcacabdc";
		String targetStr = "abd";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = 5;
		assertEquals(excepted, result);
	}
	
	@Test
	public void testT002() {
		String mainStr = "aaaaaaaaaaaaaaaaaa";
		String targetStr = "baaa";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = -1;
		assertEquals(excepted, result);
	}
}
