package com.navy.practice;

import java.util.ArrayList;
import java.util.List;

public class QingWa {
	
	//题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法？
	//青蛙的跳法为这两种情况相加：
	//1）第一次跳一个台阶，剩下n-1个台阶
	//2）第一次跳两个台阶，剩下n-2个台阶
	//假设f(n)代表跳n阶，那么f(n)=f(n-1) + f(n-2)，当n>2成立
	public static Integer qingWaTiao(Integer n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		return qingWaTiao(n-1) + qingWaTiao(n-2);
	}
	
	public static void main(String[] args) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		Integer n = 1;
		for(int i = 0; i < 100; i++) {
			if(n <= 2) {
				result.add(qingWaTiao(n));
			}
			else {
				result.add(result.get(i-1)+result.get(i-2));
			}
			n++;
			System.out.println(i + ": " + result.get(i));
		}
	}
}
