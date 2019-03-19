package com.navy.bitmap;

public class BitMap {
	
	private char[] chars;
	private int bitSize;
	
	public BitMap(int bitSize) {
		//一个char是8 bit
		this.bitSize = bitSize;
		this.chars = new char[bitSize/16 + 1];
	}
	
	public void setBit(int index) {
		if(index >= bitSize) {
			return;
		}
		int byteIndex = index / 16;
		int bitIndex = index % 16;
		chars[byteIndex] |= 1 << bitIndex;
		//number << 1; number向左移动一位，即在右边用0填充
		//1010向左移动一位，结果为10100
		//a|=b，a与b进行或操作后，将值赋予a
		//举例：00000001 |= 00000010，结果为00000011
	}
	
	public boolean get(int index) {
		if(index >= bitSize) {
			return false;
		}
		
		int byteIndex = index / 16;
		int bitIndex = index % 16;
		//number << 1; number向左移动一位，即在右边用0填充
		//((00000100 & (00000001 << 2)) ！= 0)运算讲解：
		//1）00000001 << 2，即00000001向左移动两位，即在00000001的右边补两个0，为00000100；
		//2）00000100 & 00000100,&为与操作，结果为00000100
		//3）00000100 ！= 0，结果为true
		boolean result = (chars[byteIndex] & (1<<bitIndex)) != 0;
		return result;
	}
	
	public void print() {
		for(char b : chars) {
			print(b);
		}
	}
	
	private void print(char b) {
		String result = Integer.toBinaryString(b);
		int len = result.length();
		if(len < 16) {
			for(int i = 0; i < 16-len; i++) {
				result = "0" + result;
			}
		}
		System.out.println(result);
	}
}
