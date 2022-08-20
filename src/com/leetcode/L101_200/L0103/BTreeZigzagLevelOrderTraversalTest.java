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
        TreeNode<Integer> rrl = new TreeNode<>(15);
        TreeNode<Integer> rrr = new TreeNode<>(7);
        TreeNode<Integer> rr = new TreeNode<>(20, rrl, rrr);
        TreeNode<Integer> rl = new TreeNode<>(9);
        TreeNode<Integer> root = new TreeNode<>(3, rl, rr);
        System.out.println(root);

        System.out.println(bTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root).toString());

    }
}
