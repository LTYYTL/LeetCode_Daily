package com.offer.L0220;

import com.util.ListNode;

public class DeleteNodeTest {
    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        /*
          示例：
          给定一个链表: 1->2->3->4->5, 和 k = 2.
          返回链表 4->5.
         */
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        System.out.println(deleteNode.getKthFromEnd(listNode1, 2));
    }
}
