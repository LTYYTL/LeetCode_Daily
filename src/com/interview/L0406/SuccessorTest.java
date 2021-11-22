package com.interview.L0406;

import com.util.TreeNode;

public class SuccessorTest {
    public static void main(String[] args) {
        Successor successor = new Successor();
        /**
         * 示例 1:
         * 输入: root = [2,1,3], p = 1
         *   2
         *  / \
         * 1   3
         *
         * 输出: 2
         */
        TreeNode root = new TreeNode(2);
        TreeNode rl = new TreeNode(1);
        TreeNode rr = new TreeNode(3);
        root.left = rl;
        root.right = rr;
        System.out.println(successor.inorderSuccessor(root, rl));
        /**
         * 示例 2:
         * 输入: root = [5,3,6,2,4,null,null,1], p = 6
         *       5
         *      / \
         *     3   6
         *    / \
         *   2   4
         *  /
         * 1
         * 输出: null
         */
    }
}
