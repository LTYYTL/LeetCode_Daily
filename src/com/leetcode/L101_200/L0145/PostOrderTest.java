package com.leetcode.L101_200.L0145;

import com.util.TreeNode;

public class PostOrderTest {
    public static void main(String[] args) {
        PostOrder postOrder = new PostOrder();
        /*** 示例:
         * 输入: [1,null,2,3]
         *    1
         *     \
         *      2
         *     /
         *    3
         * 输出: [3,2,1]
         * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
         */
        TreeNode root = new TreeNode(1);
        TreeNode rr = new TreeNode(2);
        TreeNode rrl = new TreeNode(3);
        root.right = rr;
        rr.left = rrl;

        //方法一：递归
        System.out.println(postOrder.postorderTraversal(root));
        //方法二：迭代
        System.out.println(postOrder.postorderTraversal_Iteration(root));
    }
}
