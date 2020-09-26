package com.leetcode.L0112;

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
         *          /  \      \
         *         7    2      1
         * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
         */
        TreeNode rlll = new TreeNode(7);
        TreeNode rllr = new TreeNode(2);
        TreeNode rll = new TreeNode(11,rlll,rllr);
        TreeNode rrrr = new TreeNode(1);
        TreeNode rrr = new TreeNode(4,null,rrrr);
        TreeNode rrl = new TreeNode(13);
        TreeNode rl = new TreeNode(4,rll,null);
        TreeNode rr = new TreeNode(8,rrl,rrr);
        TreeNode root = new TreeNode(5,rl,rr);

        System.out.println(root);
        System.out.println(pathSum.hasPathSum(root,22));
    }
}
