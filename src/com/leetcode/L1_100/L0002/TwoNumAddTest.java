package com.leetcode.L1_100.L0002;

import com.util.ListNode;

public class TwoNumAddTest {
    public static void main(String[] args) {
        TwoNumAdd twoNumAdd = new TwoNumAdd();
        //构建两个链表
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};
        //用数组构建
        ListNode l1 = new ListNode();
        l1 = l1.add(nums1,l1);
        ListNode l2 = new ListNode();
        l2 = l2.add(nums2,l2);
        //查看两个链表
        System.out.println(l1);
        System.out.println(l2);

        //查看和结果
        // 示例：
        // 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        // 输出：7 -> 0 -> 8
        // 原因：342 + 465 = 807
        System.out.println(twoNumAdd.addTwoNumbers(l1,l2));
    }
}
