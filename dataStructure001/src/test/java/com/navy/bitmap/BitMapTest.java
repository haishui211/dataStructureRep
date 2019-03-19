package com.navy.bitmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BitMapTest {
	
	@Test
	public void testSetBit() {
		BitMap bitMap = new BitMap(8);
		for(int i = 0; i < 16; i++) {
			bitMap.setBit(i);
			bitMap.print();
			System.out.println("===============");
		}
	}
	
	@Test
	public void testGet() {
		BitMap bitMap = new BitMap(8);
		int index = 2;
		bitMap.setBit(index);
		boolean result = bitMap.get(index);
		assertEquals(true, result);
	}
}
