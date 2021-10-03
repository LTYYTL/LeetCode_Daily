package com.leetcode.L801_900.L0863;

import com.util.TreeNode;

public class AllNodesDistanceKBinaryTreeTest {
    public static void main(String[] args) {
        AllNodesDistanceKBinaryTree allNodesDistanceKBinaryTree = new AllNodesDistanceKBinaryTree();
        /**
         * 示例 1：
         * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
         * 输出：[7,4,1]
         * 解释：
         * 所求结点为与目标结点（值为 5）距离为 2 的结点，
         * 值分别为 7，4，以及 1
         *
         * 注意，输入的 "root" 和 "target" 实际上是树上的结点。
         * 上面的输入仅仅是对这些对象进行了序列化描述。
         */
        TreeNode<Integer> root = new TreeNode<>(3);
        TreeNode<Integer> rl = new TreeNode<>(5);
        TreeNode<Integer> rr = new TreeNode<>(1);
        TreeNode<Integer> rll = new TreeNode<>(6);
        TreeNode<Integer> rlr = new TreeNode<>(2);
        TreeNode<Integer> rlrl = new TreeNode<>(7);
        TreeNode<Integer> rlrr = new TreeNode<>(4);
        TreeNode<Integer> rrl = new TreeNode<>(0);
        TreeNode<Integer> rrr = new TreeNode<>(8);

        root.left = rl;
        root.right = rr;

        rl.left = rll;
        rl.right = rlr;

        rlr.left = rlrl;
        rlr.right = rlrr;

        rr.left = rrl;;
        rr.right = rrr;

        System.out.println(allNodesDistanceKBinaryTree.distanceK(root, rl, 2).toString());

    }
}
