package com.navy.practice;

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
		for(int i = 1; i < 10; i++) {
			System.out.println(i + ": " + qingWaTiao(i));
		}
	}
}
