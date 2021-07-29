package com.leetcode.L1104;

public class PathInZigzagLabelledBinaryTreeTest {
    public static void main(String[] args) {
        PathInZigzagLabelledBinaryTree pathInZigzagLabelledBinaryTree = new PathInZigzagLabelledBinaryTree();
        /**
         * 示例 1：
         * 输入：label = 14
         * 输出：[1,3,4,14]
         */
        System.out.println(pathInZigzagLabelledBinaryTree.pathInZigZagTree(14).toString());
        /**
         * 示例 2：
         * 输入：label = 26
         * 输出：[1,2,6,10,26]
         */
        System.out.println(pathInZigzagLabelledBinaryTree.pathInZigZagTree(26).toString());
    }
}
