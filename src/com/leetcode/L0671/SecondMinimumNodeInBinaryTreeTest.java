package com.leetcode.L0671;

import com.util.TreeNode;

public class SecondMinimumNodeInBinaryTreeTest {
    public static void main(String[] args) {
        SecondMinimumNodeInBinaryTree secondMinimumNodeInBinaryTree = new SecondMinimumNodeInBinaryTree();
        /**
         * 示例 1：
         * 输入：root = [2,2,5,null,null,5,7]
         * 输出：5
         * 解释：最小的值是 2 ，第二小的值是 5 。
         */
        TreeNode<Integer> root = new TreeNode<>(2);
        TreeNode<Integer> rl = new TreeNode<>(2);
        TreeNode<Integer> rr = new TreeNode<>(5);
        TreeNode<Integer> rrl = new TreeNode<>(5);
        TreeNode<Integer> rrr = new TreeNode<>(7);
        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;
        System.out.println(secondMinimumNodeInBinaryTree.findSecondMinimumValue(root));
        System.out.println(secondMinimumNodeInBinaryTree.findSecondMinimumValue_set(root));
        /**
         * 示例 2：
         * 输入：root = [2,2,2]
         * 输出：-1
         * 解释：最小的值是 2, 但是不存在第二小的值。
         */
    }
}
