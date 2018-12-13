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
	
	@Test
	public void testT003() {
		String mainStr = "abcacabcbcbacabc";
		String targetStr = "abbcabc";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = -1;
		assertEquals(excepted, result);
	}
	
	@Test
	public void testT004() {
		String mainStr = "abcacabcbcbacabc";
		String targetStr = "abacabc";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = -1;
		assertEquals(excepted, result);
	}
	
	@Test
	public void testT005() {
		String mainStr = "abcacabcbcbacabc";
		String targetStr = "cbacabc";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = 9;
		assertEquals(excepted, result);
	}
	
	@Test
	public void testT006() {
		String mainStr = "万物初始之前，宇宙是无边无际混沌的黑暗，只有上帝之灵穿行其间。上帝对这无边的黑暗十分不满，就轻轻一挥手有上帝之灵穿行其间。上帝对这无边的黑暗十分不满，就轻轻一挥手万物初始之前，宇宙是无边无际混沌的黑暗，只有上帝之灵穿行其间。上帝对这无边的黑暗十分不满，就轻轻一挥手有上帝之灵穿行其间。上帝对这无边的黑暗十分不满，就轻轻一挥手";
		String targetStr = "暗无边无";
		int result = BmMatch.indexOf(mainStr, targetStr);
		System.out.println(result);
		int excepted = 41;
		assertEquals(excepted, result);
	}
	
	@Test
	public void testT007() {
		String mainStr = "a";
		String targetStr = "a";
		int result = BmMatch.indexOf(mainStr, targetStr);
		int excepted = 0;
		assertEquals(excepted, result);
	}
	
	
}
