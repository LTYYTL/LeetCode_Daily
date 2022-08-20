package com.offer.L0321;

import com.util.TreeNode;

import java.util.Arrays;

public class PrintBinaryTreeTest {
    public static void main(String[] args) {
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        /*例如:
          给定二叉树: [3,9,20,null,null,15,7],
              3
             / \
            9  20
              /  \
             15   7
          返回：

          [3,9,20,15,7]
         */
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);
        TreeNode rr = new TreeNode(20, rrl, rrr);

        TreeNode rl = new TreeNode(9);
        TreeNode root = new TreeNode(3, rl, rr);

        System.out.println(Arrays.toString(printBinaryTree.levelOrder(root)));

    }
}
