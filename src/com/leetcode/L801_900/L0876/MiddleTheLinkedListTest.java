package com.leetcode.L801_900.L0876;

import com.util.ListNode;

public class MiddleTheLinkedListTest {
    public static void main(String[] args) {
        MiddleTheLinkedList middleTheLinkedList = new MiddleTheLinkedList();
        /**
         * 示例 1：
         * 输入：[1,2,3,4,5]
         * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
         * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
         * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
         * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
         */
        ListNode l = new ListNode();
        l = l.add(new int[]{1,2,3,4,5},l);

        System.out.println(middleTheLinkedList.middleNode(l));
        System.out.println(middleTheLinkedList.middleNode_array(l));
        /**
         * 示例 2：
         * 输入：[1,2,3,4,5,6]
         * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
         * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1,2,3,4,5,6},l1);

        System.out.println(middleTheLinkedList.middleNode(l1));
        System.out.println(middleTheLinkedList.middleNode_array(l1));
    }
}
