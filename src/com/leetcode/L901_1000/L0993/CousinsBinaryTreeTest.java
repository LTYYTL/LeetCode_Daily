package com.leetcode.L901_1000.L0993;

import com.util.TreeNode;

public class CousinsBinaryTreeTest {
    public static void main(String[] args) {
        CousinsBinaryTree cousinsBinaryTree = new CousinsBinaryTree();
        /* * 示例 1：
          输入：root = [1,2,3,4], x = 4, y = 3
          输出：false
         */
        TreeNode<Integer> ll = new TreeNode<>(4);
        TreeNode<Integer> l = new TreeNode<>(2, ll, null);
        TreeNode<Integer> r = new TreeNode<>(3);
        TreeNode<Integer> root = new TreeNode<>(1, l, r);

        System.out.println(cousinsBinaryTree.isCousins(root, 4, 3));
        /*
          示例 2：
          输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
          输出：true
         */
        /*
          示例 3：
          输入：root = [1,2,3,null,4], x = 2, y = 3
          输出：false
         */
    }
}
