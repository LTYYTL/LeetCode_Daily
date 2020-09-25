package com.leetcode.L0105;

public class PerOrderAndInOrderTest {
    public static void main(String[] args) {
        PerOrderAndInOrder perOrderAndInOrder = new PerOrderAndInOrder();
        /**
         * 例如，给出
         * 前序遍历 preorder = [3,9,20,15,7]
         * 中序遍历 inorder = [9,3,15,20,7]
         * 返回如下的二叉树：
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         */
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        System.out.println(perOrderAndInOrder.buildTree(preorder,inorder));
    }
}
