package com.navy.str.match;

/**
 * BM匹配算法
 * @author haishui211
 *
 */
public class BmMatch {
	
	public static int indexOf(String origin, String target) {
		
		if(origin == null || target == null) {
			return -1;
		}
		
		int originLen= origin.length();
		int targetLen = target.length();
		if(originLen < targetLen) {
			return -1;
		}
		
		for(int i = 0; (i+targetLen) < originLen; i++) {
			String originChild = origin.substring(i, i+targetLen);
			int shift = shift(originChild, target);
			
		}
		
		return -1;
	}
	
	/**
	 * 获取位移
	 * @param originChild
	 * @param target
	 * @return
	 */
	private static int shift(String originChild, String target) {
		
		for(int j=originChild.length()-1; j > 0; j--) {
			
			String s1 = originChild.substring(j-1, j);
			String s2 = target.substring(j-1, j);
			
			if(!s1.equals(s2)) {
				int badShift = getBadShift(s1, target, j);
			}
		}
		return -1;
	}
	
	/**
	 * 获取坏字符规则下的位移
	 * @param badChar
	 * @param target
	 * @param badIndex
	 * @return
	 */
	private static int getBadShift(String badChar, String target, int badIndex) {
		int lastMatch = -1;
		for(int i = 0; i < target.length()-1; i++) {
			String s = target.substring(i, i+1);
			if(badChar.equals(s)) {
				lastMatch = i;
			}
		}
		int badShift = badIndex-lastMatch;
		System.out.println("badShif: " + badShift);
		return badShift;
	}
}
