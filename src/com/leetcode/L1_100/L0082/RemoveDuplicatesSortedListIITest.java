package com.leetcode.L1_100.L0082;

import com.util.ListNode;

public class RemoveDuplicatesSortedListIITest {
    public static void main(String[] args) {
        RemoveDuplicatesSortedListII removeDuplicatesSortedListII = new RemoveDuplicatesSortedListII();
        /**
         * 示例 1：
         * 输入：head = [1,2,3,3,4,4,5]
         * 输出：[1,2,5]
         */
        int[] nums = {1,2,3,3,4,4,5};
        ListNode res = new ListNode(-1);
        res = res.add(nums,res);

        System.out.println(removeDuplicatesSortedListII.deleteDuplicates(res));
        /**
         * 示例 2：
         * 输入：head = [1,1,1,2,3]
         * 输出：[2,3]
         */
        int[] nums1 = {1,1,1,2,3};
        ListNode res1 = new ListNode(-1);
        res1 = res1.add(nums1,res1);

        System.out.println(removeDuplicatesSortedListII.deleteDuplicates(res1));
    }
}
