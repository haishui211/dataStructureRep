package com.navy.bitmap;

import java.util.BitSet;

import org.junit.Test;

public class BitSetTest {
	
	@Test
	public void testBitSetUse() {
		BitSet bs = new BitSet(8);
//		for(int i = 0; i < 8; i++) {
//			bs.set(i, true);
//		}
		System.out.println(bs.toString());
	}
	
}
