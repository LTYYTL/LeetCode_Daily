package com.leetcode.L1_100.L0098;


import com.util.TreeNode;

public class ValidateBinarySearchTreeTest {
    public static void main(String[] args) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        /**
         * 示例 2:
         * 输入:
         *     5
         *    / \
         *   1   4
         *      / \
         *     3   6
         * 输出: false
         * 解释: 输入为: [5,1,4,null,null,3,6]。
         *      根节点的值为 5 ，但是其右子节点值为 4 。
         */
        TreeNode<Integer> root = new TreeNode<>(5);
        TreeNode<Integer> rl = new TreeNode<>(1);
        TreeNode<Integer> rr = new TreeNode<>(4);
        TreeNode<Integer> rrl = new TreeNode<>(3);
        TreeNode<Integer> rrr = new TreeNode<>(6);

        root.left = rl;
        root.right = rr;
        rr.left =rrl;
        rr.right = rrr;

        System.out.println(root);
        System.out.println(validateBinarySearchTree.isValidBST(root));
    }
}
