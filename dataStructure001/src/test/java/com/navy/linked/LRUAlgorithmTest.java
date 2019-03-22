package com.navy.linked;

import org.junit.Test;

public class LRUAlgorithmTest {
	
	@Test
	public void testAccess() {
		LRUAlgorithm<Integer> lrua = new LRUAlgorithm<Integer>(3);
		lrua.access(1);
		lrua.access(2);
		lrua.access(3);
		lrua.printAll();
		lrua.access(3);
		lrua.printAll();
		lrua.access(2);
		lrua.printAll();
		lrua.access(2);
		lrua.printAll();
		lrua.access(334);
		lrua.printAll();
		lrua.access(335);
		lrua.printAll();
	}
}
