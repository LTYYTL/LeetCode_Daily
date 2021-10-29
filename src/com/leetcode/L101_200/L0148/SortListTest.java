package com.leetcode.L101_200.L0148;

import com.util.ListNode;

public class SortListTest {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        /**
         * 示例 1：
         * 输入：head = [4,2,1,3]
         * 输出：[1,2,3,4]
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{4,2,1,3},l1);
        System.out.println(sortList.sortList(l1));
        /**
         * 示例 2：
         * 输入：head = [-1,5,3,4,0]
         * 输出：[-1,0,3,4,5]
         */
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{-1,5,3,4,0},l2);
        System.out.println(sortList.sortList(l2));
        /**
         * 示例 3：
         * 输入：head = []
         * 输出：[]
         */
        ListNode l3 = new ListNode();
        System.out.println(sortList.sortList(l3));
    }
}
