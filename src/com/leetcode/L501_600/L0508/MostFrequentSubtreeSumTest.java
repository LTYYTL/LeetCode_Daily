package com.leetcode.L501_600.L0508;

import com.util.TreeNode;

import java.util.Arrays;

public class MostFrequentSubtreeSumTest {
    public static void main(String[] args) {
        MostFrequentSubtreeSum mostFrequentSubtreeSum = new MostFrequentSubtreeSum();
        /**
         * 示例 1：
         * 输入: root = [5,2,-3]
         * 输出: [2,-3,4]
         */
        System.out.println(Arrays.toString(mostFrequentSubtreeSum.findFrequentTreeSum(new TreeNode(5, new TreeNode(2), new TreeNode(-3)))));
        /**
         * 示例 2：
         * 输入: root = [5,2,-5]
         * 输出: [2]
         */
        System.out.println(Arrays.toString(mostFrequentSubtreeSum.findFrequentTreeSum(new TreeNode(5, new TreeNode(2), new TreeNode(-5)))));
    }
}
