package com.navy.str.match;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BfMatchTest {
	
	@Test
	public void testOneOriginCharMatchOneTargetChar() {
		String str = "a";
		String str2 = "a";
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = 0;
		assertEquals(except, index);
	}
	
	@Test
	public void testTwoOriginCharMatchOneTargetChar() {
		String str = "ba";
		String str2 = "a";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = 1;
		assertEquals(except, index);
	}
	
	@Test
	public void testThreeOriginCharMatchOneTargetChar() {
		String str = "bca";
		String str2 = "a";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = 2;
		assertEquals(except, index);
	}
	
	@Test
	public void testTwoOriginCharMatchTwoTargetChar() {
		String str = "ba";
		String str2 = "ba";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = 0;
		assertEquals(except, index);
	}
	
	@Test
	public void testThreeOriginCharMatchTwoTargetChar() {
		String str = "bca";
		String str2 = "ca";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = 1;
		assertEquals(except, index);
	}
	
	@Test
	public void testThreeOriginCharNotMatchOneTargetChar() {
		String str = "bca";
		String str2 = "n";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = -1;
		assertEquals(except, index);
	}
	
	@Test
	public void testThreeOriginCharNotMatchTwoTargetChar() {
		String str = "bca";
		String str2 = "ba";
		
		int index = BfMatch.indexOf(str, str2);
		System.out.println(index);
		int except = -1;
		assertEquals(except, index);
	}
}
