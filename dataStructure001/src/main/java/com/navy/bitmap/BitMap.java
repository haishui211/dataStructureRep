package com.navy.bitmap;

public class BitMap {
	private char[] bytes;
	private int bitSize;
	
	public BitMap(int bitSize) {
		//一个char是8b
		this.bitSize = bitSize;
		this.bytes = new char[bitSize/8 + 1];
	}
}
