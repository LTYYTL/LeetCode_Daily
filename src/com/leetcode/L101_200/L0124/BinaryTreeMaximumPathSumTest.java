package com.leetcode.L101_200.L0124;

import com.util.TreeNode;

public class BinaryTreeMaximumPathSumTest {
    public static void main(String[] args) {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        /*
          示例 1：
          输入：root = [1,2,3]
          输出：6
          解释：最优路径是 2 -> 1 -> 3 ，路径和为 2 + 1 + 3 = 6
         */
        System.out.println(binaryTreeMaximumPathSum.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        /*
          示例 2：
          输入：root = [-10,9,20,null,null,15,7]
          输出：42
          解释：最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42
         */
        TreeNode rr = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode rl = new TreeNode(9);
        System.out.println(binaryTreeMaximumPathSum.maxPathSum(new TreeNode(-10, rl, rr)));
    }
}
