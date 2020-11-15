package com.leetcode.L0328;

import com.util.ListNode;

public class OddEvenLinkedListTest {
    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        /*** 示例 1:
         * 输入: 1->2->3->4->5->NULL
         * 输出: 1->3->5->2->4->NULL
         */
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(head);
        System.out.println(oddEvenLinkedList.oddEvenList(head));
    }
}
