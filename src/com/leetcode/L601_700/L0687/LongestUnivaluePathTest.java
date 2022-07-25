package com.leetcode.L601_700.L0687;

import com.util.TreeNode;

public class LongestUnivaluePathTest {
    public static void main(String[] args) {
        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        /**
         * 示例 1:
         * 输入：root = [5,4,5,1,1,5]
         * 输出：2
         */
        System.out.println(longestUnivaluePath.longestUnivaluePath(new TreeNode<>(5, new TreeNode(4, new TreeNode(1), new TreeNode(1)), new TreeNode(5, null, new TreeNode(5)))));
        /**
         * 示例 2:
         * 输入：root = [1,4,5,4,4,5]
         * 输出：2
         */
        System.out.println(longestUnivaluePath.longestUnivaluePath(new TreeNode<>(1, new TreeNode(4, new TreeNode(4), new TreeNode(4)), new TreeNode(5, null, new TreeNode(5)))));

    }
}
