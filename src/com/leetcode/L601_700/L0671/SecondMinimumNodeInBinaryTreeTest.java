package com.leetcode.L601_700.L0671;

import com.util.TreeNode;

public class SecondMinimumNodeInBinaryTreeTest {
    public static void main(String[] args) {
        SecondMinimumNodeInBinaryTree secondMinimumNodeInBinaryTree = new SecondMinimumNodeInBinaryTree();
        /*
          示例 1：
          输入：root = [2,2,5,null,null,5,7]
          输出：5
          解释：最小的值是 2 ，第二小的值是 5 。
         */
        TreeNode root = new TreeNode(2);
        TreeNode rl = new TreeNode(2);
        TreeNode rr = new TreeNode(5);
        TreeNode rrl = new TreeNode(5);
        TreeNode rrr = new TreeNode(7);
        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;
        System.out.println(secondMinimumNodeInBinaryTree.findSecondMinimumValue(root));
        System.out.println(secondMinimumNodeInBinaryTree.findSecondMinimumValue_set(root));
        /*
          示例 2：
          输入：root = [2,2,2]
          输出：-1
          解释：最小的值是 2, 但是不存在第二小的值。
         */
    }
}
