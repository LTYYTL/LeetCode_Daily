package com.leetcode.L0021;

import com.util.ListNode;

public class MergeTwoSortedListsTest {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        /**
         * 示例 1：
         * 输入：l1 = [1,2,4], l2 = [1,3,4]
         * 输出：[1,1,2,3,4,4]
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1,2,3},l1);
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{1,3,4},l2);
        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1, l2));
        /**
         * 示例 2：
         * 输入：l1 = [], l2 = []
         * 输出：[]
         */
        System.out.println(mergeTwoSortedLists.mergeTwoLists(new ListNode(), new ListNode()));
        /**
         * 示例 3：
         * 输入：l1 = [], l2 = [0]
         * 输出：[0]
         */
        System.out.println(mergeTwoSortedLists.mergeTwoLists(new ListNode(), new ListNode(0)));
    }
}
