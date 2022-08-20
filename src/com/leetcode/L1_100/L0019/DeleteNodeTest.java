package com.leetcode.L1_100.L0019;

import com.util.ListNode;

public class DeleteNodeTest {
    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();

        /*
          示例：
          给定一个链表: 1->2->3->4->5, 和 n = 2.
          当删除了倒数第二个节点后，链表变为 1->2->3->5.
         */
        int[] nums = {1, 2, 3, 4, 5};
        ListNode res = new ListNode(-1);
        res = res.add(nums, res);

        System.out.println(deleteNode.removeNthFromEnd(res, 2));
    }
}
