package com.leetcode.L101_200.L0110;

import com.util.TreeNode;

public class AVLTest {
    public static void main(String[] args) {
        AVL avl = new AVL();
        /**
         * 示例 1:
         * 给定二叉树 [3,9,20,null,null,15,7]
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         * 返回 true 。
         *
         * 示例 2:
         * 给定二叉树 [1,2,2,3,3,null,null,4,4]
         *        1
         *       / \
         *      2   2
         *     / \
         *    3   3
         *   / \
         *  4   4
         * 返回 false 。
         */
        TreeNode root = new TreeNode(3);
        TreeNode rl = new TreeNode(9);
        TreeNode rr = new TreeNode(20);
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);

        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;

        System.out.println(avl.isBalanced(root));
    }
}
