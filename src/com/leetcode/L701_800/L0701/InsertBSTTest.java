package com.leetcode.L701_800.L0701;

import com.util.TreeNode;

public class InsertBSTTest {
    public static void main(String[] args) {
        InsertBST insertBST = new InsertBST();
        /*
          例如
          给定二叉搜索树:

                  4
                 / \
                2   7
               / \
              1   3

          和 插入的值: 5
          你可以返回这个二叉搜索树:
                   4
                 /   \
                2     7
               / \   /
              1   3 5
          或者这个树也是有效的:
                   5
                 /   \
                2     7
               / \
              1   3
                   \
                    4
         */
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(3);
        TreeNode rl = new TreeNode(2, rll, rlr);
        TreeNode rr = new TreeNode(7);
        TreeNode root = new TreeNode(4, rl, rr);

        //方法一：递归
        System.out.println(insertBST.insertIntoBST(root, 5));
        //方法二：迭代
        System.out.println(insertBST.insertIntoBST_Iteration(root,5));
    }
}
