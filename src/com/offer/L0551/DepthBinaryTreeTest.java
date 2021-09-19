package com.offer.L0551;

import com.util.TreeNode;

public class DepthBinaryTreeTest {
    public static void main(String[] args) {
        DepthBinaryTree depthBinaryTree = new DepthBinaryTree();
        /**
         * 例如：
         * 给定二叉树 [3,9,20,null,null,15,7]，
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         * 返回它的最大深度 3 。
         */
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);
        TreeNode rr = new TreeNode(20,rrl,rrr);
        TreeNode rl = new TreeNode(9);
        TreeNode root = new TreeNode(3,rl,rr);

        System.out.println(depthBinaryTree.maxDepth(root));
    }
}
