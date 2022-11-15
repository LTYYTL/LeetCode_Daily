package com.leetcode.L101_200.L0111;

import com.util.TreeNode;

public class MinimumDepthBinaryTreeTest {
    public static void main(String[] args) {
        MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
        /*示例 1：
          输入：root = [3,9,20,null,null,15,7]
          输出：2
         */
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);
        TreeNode rr = new TreeNode(20, rrl, rrr);
        TreeNode rl = new TreeNode(9);
        TreeNode root = new TreeNode(3, rl, rr);
        System.out.println(minimumDepthBinaryTree.minDepth(root));
    }
}
