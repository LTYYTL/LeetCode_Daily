package com.leetcode.L401_500.L0445;

import com.util.ListNode;

public class AddTwoNumbersIITest {
    public static void main(String[] args) {
        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
        /**
         * 示例1：
         * 输入：l1 = [7,2,4,3], l2 = [5,6,4]
         * 输出：[7,8,0,7]
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{7,2,4,3},l1);
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{5,6,4},l2);
        System.out.println(addTwoNumbersII.addTwoNumbers(l1, l2));
        /**
         * 示例2：
         * 输入：l1 = [2,4,3], l2 = [5,6,4]
         * 输出：[8,0,7]
         */
        /**
         * 示例3：
         * 输入：l1 = [0], l2 = [0]
         * 输出：[0]
         */
    }
}
