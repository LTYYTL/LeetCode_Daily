package com.leetcode.L1_100.L0100;

import com.util.TreeNode;

public class SameTreeTest {
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        /**
         * 示例 1：
         * 输入：p = [1,2,3], q = [1,2,3]
         * 输出：true
         */
        System.out.println(sameTree.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        /**
         * 示例 2：
         * 输入：p = [1,2], q = [1,null,2]
         * 输出：false
         */
        System.out.println(sameTree.isSameTree(
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(1, new TreeNode(2), null)));
        /**
         * 示例 3：
         * 输入：p = [1,2,1], q = [1,1,2]
         * 输出：false
         */
        System.out.println(sameTree.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(1)),
                new TreeNode(1, new TreeNode(1), new TreeNode(2))));
    }
}
