package com.navy.str.match;

import java.util.ArrayList;
import java.util.List;

/**
 * BM匹配算法
 * @author haishui211
 *
 */
public class BmMatch {
	
	public static int indexOf(String origin, String target) {
		int result = -1;
		
		if(origin == null || target == null) {
			return result;
		}
		
		int originLen= origin.length();
		int targetLen = target.length();
		
		if(originLen < targetLen) {
			return result;
		}
		
		Shift shift = new Shift();
		for(int i = 0; (i+targetLen) < originLen; ) {
			String originChild = origin.substring(i, i+targetLen);
			if(matchOne(originChild, target, shift)) {
				result = i;
				break;
			}
			i += shift.getValue();
		}
		
		return result;
	}
	
	/**
	 * 主串孩子是否与模式串相同
	 * @param originChild
	 * @param target
	 * @param shift
	 * @return
	 */
	private static boolean matchOne(String originChild, String target, Shift shift) {
		String goodTail = "";
		for(int i = originChild.length(); (i-1) >= 0; i--) {
			int startIndex = i - 1;
			String s1 = originChild.substring(startIndex, i);
			String s2 = target.substring(startIndex, i);
			
			if(!s1.equals(s2)) {
				shift(target, s1, goodTail, startIndex, shift);
				return false;
			}
			goodTail+=s1;
		}
		
		return true;
	}
	
	/**
	 * 获取下一次移动位移
	 * @param target
	 * @param badChar
	 * @param goodTail
	 * @param badIndex
	 * @param shift
	 */
	private static void shift(String target, String badChar, String goodTail, int badIndex, Shift shift) {
		int badShift = getBadCharShift(badChar, target, badIndex);
		int goodShift = getGoodTailShift(target, goodTail, badIndex);
		if(badShift > goodShift) {
			shift.setValue(badShift);
		}
		else {
			shift.setValue(goodShift);
		}
		if(shift.getValue() < 1) {
			shift.setValue(1);
		}
		System.out.println("badShif: " + badShift);
		System.out.println("goodShift: " + goodShift);
		System.out.println("shift: " + shift.getValue());
		System.out.println("================");
	}
	
	/**
	 * 获取好后缀规则下的位移
	 * @param target
	 * @param goodTail
	 * @param badIndex
	 * @return
	 */
	private static int getGoodTailShift(String target, String goodTail, int badIndex) {
		if(goodTail == null || goodTail.length() < 1) {
			return -1;
		}
		int otherGoodTailLastInTarget = otherGoodTailLastInTarget(target, goodTail, badIndex);
		int result = badIndex + 1 - otherGoodTailLastInTarget;
		return result;
	}
	
	/**
	 * 获取模式串中最靠近好后缀的另一个好后缀位置
	 * @param target
	 * @param goodTail
	 * @param badIndex
	 * @return
	 */
	private static int otherGoodTailLastInTarget(String target, String goodTail, int badIndex) {
		int index = -1;
		List<String> goodTailChildList = goodTailChildList(goodTail);
		for(int i = 0; i < goodTailChildList.size(); i++) {
			String goodTailChild = goodTailChildList.get(i);
			index = goodTailChildLastInTarget(target, goodTailChild, badIndex);
			if(index >= 0) {
				break;
			}
		}
		return index;
	}
	
	/**
	 * 获取模式串中最靠近指定好后缀孩子的另一个好后缀孩子位置，时间复杂度O(n*m)，n为target长度，m为goodTail长度
	 * @param target
	 * @param goodTail
	 * @param badIndex
	 * @return
	 */
	private static int goodTailChildLastInTarget(String target, String goodTail, int badIndex) {
		int goodTailLen = goodTail.length();
		for(int i = badIndex; (i-goodTailLen) >= 0; i--) {
			String maybeGoodTail = target.substring(i-goodTailLen, i);
			if(isEqual(maybeGoodTail, goodTail)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 获取好后缀的所有好后缀孩子串，时间复杂度为O(n)，n为goodTail的长度
	 * 举例：ABCD的所有好后缀孩子串为ABCD、BCD、CD、D
	 * @param goodTail
	 * @return
	 */
	private static List<String> goodTailChildList(String goodTail){
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < goodTail.length(); i++) {
			String s = goodTail.substring(i, goodTail.length());
			result.add(s);
		}
		return result;
	}
	
	/**
	 * 判断字符串str1与str2是否相等，时间复杂度O(n)，n为str1的长度
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean isEqual(String str1, String str2) {
		boolean result = true;
		for(int j = 0; (j+1) <= str1.length(); j++) {
			String s1 = str1.substring(j, j+1);
			String s2 = str2.substring(j, j+1);
			if(!s1.equals(s2)) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 获取坏字符规则下的位移
	 * @param badChar
	 * @param target
	 * @param badIndex
	 * @return
	 */
	private static int getBadCharShift(String badChar, String target, int badIndex) {
		boolean isBadCharExistInTarget = false;
		int lastMatch = -1;
		for(int i = 0; (i+1) <= target.length(); i++) {
			String s = target.substring(i, i+1);
			if(badChar.equals(s)) {
				isBadCharExistInTarget = true;
				lastMatch = i;
			}
		}
		
		if(isBadCharExistInTarget) {
			return badIndex-lastMatch;
		}
		return target.length();
	}
	
	private static class Shift{
		private Integer value;

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}
}
