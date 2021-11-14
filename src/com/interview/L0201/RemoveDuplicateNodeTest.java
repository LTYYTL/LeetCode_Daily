package com.interview.L0201;

import com.util.ListNode;

public class RemoveDuplicateNodeTest {
    public static void main(String[] args) {
        RemoveDuplicateNode removeDuplicateNode = new RemoveDuplicateNode();
        /**
         * 示例1:
         * 输入：[1, 2, 3, 3, 2, 1]
         * 输出：[1, 2, 3]
         */
        ListNode listNode = new ListNode();
        listNode = listNode.add(new int[]{1, 2, 3, 3, 2, 1},listNode);
        System.out.println(removeDuplicateNode.removeDuplicateNodes(listNode));
        /**
         * 示例2:
         * 输入：[1, 1, 1, 1, 2]
         * 输出：[1, 2]
         */
        ListNode listNode1 = new ListNode();
        listNode1 = listNode1.add(new int[]{1, 1, 1, 1, 2},listNode1);
        System.out.println(removeDuplicateNode.removeDuplicateNodes(listNode1));
    }
}
