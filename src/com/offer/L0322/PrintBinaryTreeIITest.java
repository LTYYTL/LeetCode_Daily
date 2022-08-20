package com.offer.L0322;

import com.util.TreeNode;

import java.util.List;

public class PrintBinaryTreeIITest {
    public static void main(String[] args) {
        PrintBinaryTreeII printBinaryTreeII = new PrintBinaryTreeII();
        /*
          例如:
          给定二叉树: [3,9,20,null,null,15,7],
              3
             / \
            9  20
              /  \
             15   7
          返回其层次遍历结果：
          [
            [3],
            [9,20],
            [15,7]
          ]
         */
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);
        TreeNode rr = new TreeNode(20, rrl, rrr);

        TreeNode rl = new TreeNode(9);
        TreeNode root = new TreeNode(3, rl, rr);

        List<List<Integer>> lists = printBinaryTreeII.levelOrder(root);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
