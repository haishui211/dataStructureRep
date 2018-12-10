package com.navy.str.match;

public class RkMatch {
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
		
		int targetHashValue = target.hashCode();
		for(int i = 0; (i+targetLen) <= originLen; i++) {
			String originChild = origin.substring(i, i+targetLen);
			if(matchOne(originChild, target, targetHashValue)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private static boolean matchOne(String originChild, String target, int targetHashValue) {
		
		int originChildHashValue = originChild.hashCode();
		if(originChildHashValue != targetHashValue) {
			return false;
		}
		
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
