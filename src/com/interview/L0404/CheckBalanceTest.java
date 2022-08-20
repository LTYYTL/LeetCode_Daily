package com.interview.L0404;

import com.util.TreeNode;

public class CheckBalanceTest {
    public static void main(String[] args) {
        CheckBalance checkBalance = new CheckBalance();
        /* * 示例 1:
          给定二叉树 [3,9,20,null,null,15,7]
              3
             / \
            9  20
              /  \
             15   7
          返回 true 。
         */
        TreeNode rr = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(checkBalance.isBalanced(new TreeNode(3, new TreeNode(9), rr)));
        /*
          示例 2:
          给定二叉树 [1,2,2,3,3,null,null,4,4]
                1
               / \
              2   2
             / \
            3   3
           / \
          4   4
          返回 false 。
         */
        TreeNode rll = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        TreeNode rl = new TreeNode(2, rll, new TreeNode(3));
        System.out.println(checkBalance.isBalanced(new TreeNode(1, rl, new TreeNode(2))));
    }
}
