package com.leetcode.L0404;

import com.util.TreeNode;

public class LeftLeavesSumTest {
    public static void main(String[] args) {
        LeftLeavesSum leftLeavesSum = new LeftLeavesSum();
        /**
         * 示例：
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
         */

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
        System.out.println(leftLeavesSum.sumOfLeftLeaves(r1));
    }
}
