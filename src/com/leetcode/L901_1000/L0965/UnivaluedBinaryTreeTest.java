package com.leetcode.L901_1000.L0965;

import com.util.TreeNode;

public class UnivaluedBinaryTreeTest {
    public static void main(String[] args) {
        UnivaluedBinaryTree univaluedBinaryTree = new UnivaluedBinaryTree();
        /**
         * 示例 1：
         * 输入：[1,1,1,1,1,null,1]
         * 输出：true
         */
        System.out.println(univaluedBinaryTree.isUnivalTree(new TreeNode<>(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)), new TreeNode(1, null, new TreeNode(1)))));
        /**
         * 示例 2：
         * 输入：[2,2,2,5,2]
         * 输出：false
         */
        System.out.println(univaluedBinaryTree.isUnivalTree(new TreeNode<>(2, new TreeNode(2, new TreeNode(5), new TreeNode(2)), new TreeNode(2))));
    }
}
