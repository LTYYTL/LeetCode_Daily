package com.leetcode.L801_900.L0814;


import com.util.TreeNode;

public class BinaryTreePruningTest {
    public static void main(String[] args) {
        BinaryTreePruning binaryTreePruning = new BinaryTreePruning();
        /** * 示例1:
         * 输入: [1,null,0,0,1]
         * 输出: [1,null,0,null,1]
         */
        TreeNode root1 = new TreeNode(1);
        TreeNode rr1 = new TreeNode(0);
        TreeNode rrl1 = new TreeNode(0);
        TreeNode rrr1 = new TreeNode(1);
        root1.right = rr1;
        rr1.left = rrl1;
        rr1.right = rrr1;
        System.out.println(binaryTreePruning.pruneTree(root1));

    }
}
