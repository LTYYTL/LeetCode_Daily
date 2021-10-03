package com.leetcode.L1_100.L0083;

import com.util.ListNode;

public class RemoveDuplicatesSortedListTest {
    public static void main(String[] args) {
        RemoveDuplicatesSortedList removeDuplicatesSortedList = new RemoveDuplicatesSortedList();
        /**
         * 示例 1:
         * 输入: 1->1->2
         * 输出: 1->2
         */
        int[] nums = {1,1,2};
        ListNode res = new ListNode(-1);
        res = res.add(nums,res);

        System.out.println(removeDuplicatesSortedList.deleteDuplicates(res));
        /**
         * 示例 2:
         * 输入: 1->1->2->3->3
         * 输出: 1->2->3
         */
        int[] nums1 = {1,1,2,3,3};
        ListNode res1 = new ListNode(-1);
        res1 = res1.add(nums1,res1);

        System.out.println(removeDuplicatesSortedList.deleteDuplicates(res1));
    }
}
