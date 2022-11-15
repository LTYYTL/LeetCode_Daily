package com.leetcode.L201_300.L0226;

import com.util.TreeNode;

public class InvertBinaryTreeTest {
    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        /*
          示例：
          输入：

               4
             /   \
            2     7
           / \   / \
          1   3 6   9

          输出：
               4
             /   \
            7     2
           / \   / \
          9   6 3   1
         */
        //构建二叉树
        TreeNode root = new TreeNode(4);
        TreeNode rl = new TreeNode(2);
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(3);
        TreeNode rr = new TreeNode(7);
        TreeNode rrl = new TreeNode(6);
        TreeNode rrr = new TreeNode(9);

        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;
        rr.left = rrl;
        rr.right = rrr;

        invertBinaryTree.invertTree(root);
        System.out.println(root);
    }
}
