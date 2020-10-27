package com.leetcode.L0144;

import com.util.TreeNode;

public class PerOrderTest {
    public static void main(String[] args) {
        PerOrder perOrder = new PerOrder();
        /**
         * 示例:
         * 输入: [1,null,2,3]
         *    1
         *     \
         *      2
         *     /
         *    3
         * 输出: [1,2,3]
         */
        TreeNode root = new TreeNode(1);
        TreeNode rr = new TreeNode(2);
        TreeNode rrl = new TreeNode(3);
        root.right = rr;
        rr.left = rrl;

        //方法一：递归
        System.out.println(perOrder.preorderTraversal(root));
        //方法二：迭代
        System.out.println(perOrder.preorderTraversal_Iteration(root));
    }
}
