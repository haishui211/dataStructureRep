package com.navy.str.match;

/**
 * 字符串BF匹配算法
 * 暴力匹配算法
 * @author haishui211
 */
public class BfMatch {
	
	/**
	 * 时间复杂度O(n*m)
	 * n:origin字符串的长度，aaaaaaaaaaaa……c
	 * m:target字符串的长度，ac
	 * @param origin
	 * @param target
	 * @return
	 */
	public static int indexOf(String origin, String target) {
		
		if(origin == null || target == null) {
			return -1;
		}
		
		int originLen= origin.length();
		int targetLen = target.length();
		if(originLen < targetLen) {
			return -1;
		}
		
		for(int i = 0; (i+targetLen) <= originLen; i++) {
			String originChild = origin.substring(i, i+targetLen);
			if(matchOne(originChild, target)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private static boolean matchOne(String originChild, String target) {
		for(int i = 0; (i+1) <= originChild.length(); i++) {
			String s1 = originChild.substring(i, i+1);
			String s2 = target.substring(i, i+1);
			if(!s1.equals(s2)) {
				return false;
			}
		}
		return true;
	}
}
