package com.offer.L0340;

import com.util.TreeNode;

public class PathSumTest {
    public static void main(String[] args) {
        PathSum pathSum = new PathSum();
        /**
         * 示例:
         * 给定如下二叉树，以及目标和 sum = 22，
         *               5
         *              / \
         *             4   8
         *            /   / \
         *           11  13  4
         *          /  \    / \
         *         7    2  5   1
         * 返回:
         *
         * [
         *    [5,4,11,2],
         *    [5,8,4,5]
         * ]
         */
        TreeNode rlll = new TreeNode(7);
        TreeNode rllr = new TreeNode(2);
        TreeNode rll = new TreeNode(11,rlll,rllr);
        TreeNode rrrl = new TreeNode(5);
        TreeNode rrrr = new TreeNode(1);
        TreeNode rrr = new TreeNode(4,rrrl,rrrr);
        TreeNode rrl = new TreeNode(13);
        TreeNode rl = new TreeNode(4,rll,null);
        TreeNode rr = new TreeNode(8,rrl,rrr);
        TreeNode root = new TreeNode(5,rl,rr);

        System.out.println(root);
        System.out.println(pathSum.pathSum(root,22));
    }
}
