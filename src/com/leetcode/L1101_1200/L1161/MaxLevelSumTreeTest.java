package com.leetcode.L1101_1200.L1161;

import com.util.TreeNode;

public class MaxLevelSumTreeTest {
    public static void main(String[] args) {
        MaxLevelSumTree maxLevelSumTree = new MaxLevelSumTree();
        /** * 示例 1：
         * 输入：root = [1,7,0,7,-8,null,null]
         * 输出：2
         * 解释：
         * 第 1 层各元素之和为 1，
         * 第 2 层各元素之和为 7 + 0 = 7，
         * 第 3 层各元素之和为 7 + -8 = -1，
         * 所以我们返回第 2 层的层号，它的层内元素之和最大。
         */
        System.out.println(maxLevelSumTree.maxLevelSum(new TreeNode(1, new TreeNode(7, new TreeNode(7), new TreeNode(-8)), new TreeNode(0))));
    }
}
