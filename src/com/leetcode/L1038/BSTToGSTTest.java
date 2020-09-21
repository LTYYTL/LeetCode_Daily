package com.leetcode.L1038;

import com.util.TreeNode;

public class BSTToGSTTest {
    public static void main(String[] args) {
        BSTToGST bstToGST = new BSTToGST();
        /**
         * 示例：
         *                4
         *             /    \
         *           1      6
         *         /   \  /   \
         *        0    2 5    7
         *              \      \
         *              3       8
         * 输入：[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
         * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
         */
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> rl = new TreeNode<>(1);
        TreeNode<Integer> rr = new TreeNode<>(6);
        TreeNode<Integer> rll = new TreeNode<>(0);
        TreeNode<Integer> rlr = new TreeNode<>(2);
        TreeNode<Integer> rrl = new TreeNode<>(5);
        TreeNode<Integer> rrr = new TreeNode<>(7);
        TreeNode<Integer> rlrr = new TreeNode<>(3);
        TreeNode<Integer> rrrr = new TreeNode<>(8);

        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;
        rr.left = rrl;
        rr.right = rrr;
        rlr.right = rlrr;
        rrr.right = rrrr;
        //方法一：递归
        System.out.println(bstToGST.bstToGst(root));
        //方法二：迭代
        System.out.println(bstToGST.bstToGst_Iteration(root));
    }
}
