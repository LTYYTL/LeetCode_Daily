package com.leetcode.L0107;

import com.util.TreeNode;

public class LevelOrderIITest {
    public static void main(String[] args) {
        LevelOrderII levelOrderII = new LevelOrderII();

        //构建二叉树
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(9);
        TreeNode r3 = new TreeNode(20);
        TreeNode r4 = new TreeNode(15);
        TreeNode r5 = new TreeNode(7);
        r1.left = r2;
        r1.right = r3;
        r3.left = r4;
        r3.right = r5;
        /**
         * 例如：
         * 给定二叉树 [3,9,20,null,null,15,7],
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         * 返回其自底向上的层次遍历为：
         * [
         *   [15,7],
         *   [9,20],
         *   [3]
         * ]
         */
        System.out.println(levelOrderII.levelOrderBottom(r1).toString());
    }
}
