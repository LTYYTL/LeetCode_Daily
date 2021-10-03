package com.leetcode.L101_200.L0111;

import com.util.TreeNode;

public class MinimumDepthBinaryTreeTest {
    public static void main(String[] args) {
        MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
        /**示例 1：
         * 输入：root = [3,9,20,null,null,15,7]
         * 输出：2
         */
        TreeNode<Integer> rrl = new TreeNode<>(15);
        TreeNode<Integer> rrr = new TreeNode<>(7);
        TreeNode<Integer> rr = new TreeNode<>(20, rrl, rrr);
        TreeNode<Integer> rl = new TreeNode<>(9);
        TreeNode<Integer> root = new TreeNode<>(3, rl, rr);
        System.out.println(minimumDepthBinaryTree.minDepth(root));
    }
}
