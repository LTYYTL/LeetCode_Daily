package com.leetcode.L101_200.L0103;

import com.util.TreeNode;

public class BTreeZigzagLevelOrderTraversalTest {
    public static void main(String[] args) {
        BTreeZigzagLevelOrderTraversal bTreeZigzagLevelOrderTraversal = new BTreeZigzagLevelOrderTraversal();
        /*
          例如：
          给定二叉树 [3,9,20,null,null,15,7],
              3
             / \
            9  20
              /  \
             15   7
          返回锯齿形层序遍历如下：
          [
            [3],
            [20,9],
            [15,7]
          ]
         */
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);
        TreeNode rr = new TreeNode(20, rrl, rrr);
        TreeNode rl = new TreeNode(9);
        TreeNode root = new TreeNode(3, rl, rr);
        System.out.println(root);

        System.out.println(bTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root).toString());

    }
}
