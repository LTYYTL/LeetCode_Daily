package com.leetcode.L401_500.L0450;

import com.util.TreeNode;

public class DeleteNodeTToBSTTest {
    public static void main(String[] args) {
        DeleteNodeTToBST deleteNodeTToBST = new DeleteNodeTToBST();
        /**
         * 示例:
         * root = [5,3,6,2,4,null,7]
         * key = 3
         *     5
         *    / \
         *   3   6
         *  / \   \
         * 2   4   7
         * 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
         * 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
         *     5
         *    / \
         *   4   6
         *  /     \
         * 2       7
         *
         * 另一个正确答案是 [5,2,6,null,4,null,7]。
         *     5
         *    / \
         *   2   6
         *    \   \
         *     4   7
         */
        TreeNode<Integer> root = new TreeNode<>(5);
        TreeNode<Integer> rl = new TreeNode<>(3);
        TreeNode<Integer> rr = new TreeNode<>(6);
        TreeNode<Integer> rll = new TreeNode<>(2);
        TreeNode<Integer> rlr = new TreeNode<>(4);
        TreeNode<Integer> rrr = new TreeNode<>(7);

        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;
        rr.right = rrr;

        System.out.println(root);

        System.out.println(deleteNodeTToBST.deleteNode(root,3));
    }
}
