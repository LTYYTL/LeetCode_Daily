package com.leetcode.L0106;

public class InOrderAndLastOrderTest {
    public static void main(String[] args) {
        InOrderAndLastOrder inOrderAndLastOrder = new InOrderAndLastOrder();
        /**
         * 例如，给出
         * 中序遍历 inorder = [9,3,15,20,7]
         * 后序遍历 postorder = [9,15,7,20,3]
         * 返回如下的二叉树：
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         */
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        System.out.println(inOrderAndLastOrder.buildTree(inorder,postorder));
    }
}
