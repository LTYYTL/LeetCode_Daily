package com.leetcode.L0024;

import com.util.ListNode;

public class SwapNodesInPairsTest {
    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        /**
         * 示例 1：
         * 输入：head = [1,2,3,4]
         * 输出：[2,1,4,3]
         */
        ListNode node = new ListNode();
        int[] nums = {1,2,3,4};
        node = node.add(nums,node);
        System.out.println(node);
        System.out.println(swapNodesInPairs.swapPairs(node));
    }
}
