package com.offer.L0552;

import com.util.TreeNode;

public class BalancedBinaryTreeTest {
    public static void main(String[] args) {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        /*
          示例 1:
          给定二叉树 [3,9,20,null,null,15,7]
              3
             / \
            9  20
              /  \
             15   7
          返回 true 。

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
        TreeNode root = new TreeNode(3);
        TreeNode rl = new TreeNode(9);
        TreeNode rr = new TreeNode(20);
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);

        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;

        System.out.println(balancedBinaryTree.isBalanced(root));
    }
}
