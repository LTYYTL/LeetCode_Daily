package com.leetcode.L0107;

import com.util.TreeNode;

public class LevelOrderIITest {
    public static void main(String[] args) {
        LevelOrderII levelOrderII = new LevelOrderII();

        //构建二叉树
        Integer[] nums = {3,9,20,null,null,15,7};
        TreeNode tree = new TreeNode(nums);
        System.out.println(tree.root);
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
        System.out.println(levelOrderII.levelOrderBottom(tree.root).toString());
    }
}
