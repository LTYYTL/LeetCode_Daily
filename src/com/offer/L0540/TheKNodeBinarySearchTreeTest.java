package com.offer.L0540;


import com.util.TreeNode;

public class TheKNodeBinarySearchTreeTest {
    public static void main(String[] args) {
        TheKNodeBinarySearchTree theKNodeBinarySearchTree = new TheKNodeBinarySearchTree();
        /**
         * 示例 1:
         * 输入: root = [3,1,4,null,2], k = 1
         *    3
         *   / \
         *  1   4
         *   \
         *    2
         * 输出: 4
         */
        TreeNode root = new TreeNode(3);
        TreeNode rl = new TreeNode(1);
        TreeNode rr = new TreeNode(4);
        TreeNode rlr = new TreeNode(2);
        root.left = rl;
        root.right = rr;
        rl.right = rlr;

        System.out.println(theKNodeBinarySearchTree.kthLargest(root, 1));

        /**
         * 示例 2:
         * 输入: root = [5,3,6,2,4,null,null,1], k = 3
         *        5
         *       / \
         *      3   6
         *     / \
         *    2   4
         *   /
         *  1
         * 输出: 4
         */
    }
}
