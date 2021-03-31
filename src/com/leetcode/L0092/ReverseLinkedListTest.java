package com.leetcode.L0092;

import com.util.ListNode;

public class ReverseLinkedListTest {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        /*** 示例 1：
         * 输入：head = [1,2,3,4,5], left = 2, right = 4
         * 输出：[1,4,3,2,5]
         */
        int[] nums = {1,2,3,4,5};
        ListNode head = new ListNode(0);
        head = head.add(nums,head);
        System.out.println(reverseLinkedList.reverseBetween(head, 2, 4));
        /**
         * 示例 2：
         * 输入：head = [5], left = 1, right = 1
         * 输出：[5]
         */
        int[] nums1 = {5};
        ListNode head1 = new ListNode(0);
        head1 = head1.add(nums1,head1);
        System.out.println(reverseLinkedList.reverseBetween(head1, 1, 1));
    }
}
