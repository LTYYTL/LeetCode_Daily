package com.leetcode.L101_200.L0129;

import com.util.TreeNode;

public class SumRootLeafNumbersTest {
    public static void main(String[] args) {
        SumRootLeafNumbers sumRootLeafNumbers = new SumRootLeafNumbers();
        /**
         * 示例 1：
         * 输入：root = [1,2,3]
         * 输出：25
         * 解释：
         * 从根到叶子节点路径 1->2 代表数字 12
         * 从根到叶子节点路径 1->3 代表数字 13
         * 因此，数字总和 = 12 + 13 = 25
         */
        System.out.println(sumRootLeafNumbers.sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        /**
         * 示例 2：
         * 输入：root = [4,9,0,5,1]
         * 输出：1026
         * 解释：
         * 从根到叶子节点路径 4->9->5 代表数字 495
         * 从根到叶子节点路径 4->9->1 代表数字 491
         * 从根到叶子节点路径 4->0 代表数字 40
         * 因此，数字总和 = 495 + 491 + 40 = 1026
         */
        System.out.println(sumRootLeafNumbers.sumNumbers(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0))));
    }
}
