package com.navy.practice;

public class RemoveNthFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		//双指针法
		
		//先走n步
		ListNode quickNode = head;
		while(quickNode != null && n > 0) {
			quickNode = quickNode.next;
			n--;
		}
		
		//快慢指针一块走
		//如果快指针为null，即为走到了尽头，而慢指针则走到了尽头的倒数第n个位置
		ListNode target = head;
		ListNode preTarget = null;
		while(quickNode != null) {
			preTarget = target;
			target = target.next;
			quickNode = quickNode.next;
		}
		
		//如果找到的删除节点恰好是头节点
		if(preTarget == null) {
			head = target.next;
		}
		
		//如果找到的删除节点有前一个节点
		if(preTarget != null && target != null) {
			preTarget.next = target.next;
		}
		
		return head;
	}
}
