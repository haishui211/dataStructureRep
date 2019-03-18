package com.navy.bitmap;

public class BitMap {
	
	private byte[] bytes;
	private int bitSize;
	
	public BitMap(int bitSize) {
		//一个char是8 bit
		this.bitSize = bitSize;
		this.bytes = new byte[bitSize/8 + 1];
	}
	
	public void setBit(int index) {
		int byteIndex = index / 8;
		int bitIndex = index % 8;
		bytes[byteIndex] |= 1 << bitIndex;
		//number << 1; number向左移动一位，即在右边用0填充
		//1010向左移动一位，结果为10100
		//a|=b，a与b或操作后，将值赋予a
		//举例：00000001 |= 00000010，结果为00000011
	}
	
	public void print() {
		for(byte b : bytes) {
			print(b);
		}
	}
	
	private void print(byte b) {
		String result = Integer.toBinaryString((int)b);
		int len = result.length();
		if(len < 8) {
			for(int i = 0; i < 8-len; i++) {
				result = "0" + result;
			}
		}
		System.out.println(result);
	}
}
