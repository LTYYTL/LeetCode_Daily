package com.util;

public class ListNode {
    public int val;
    public ListNode next;

    /**
     * 默认节点值为0
     */
    public ListNode(){
        this.val = 0;
    }
    public ListNode(int val){
        this.val = val;
    }

    /**
     * 用数组添加节点
     * @param nums  数组
     * @param head  原链表
     */
    public ListNode add(int[] nums,ListNode head){
        ListNode res = head;
        for (int num : nums) {
            res.next = new ListNode(num);
            res = res.next;
        }
        return head.next;
    }
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
