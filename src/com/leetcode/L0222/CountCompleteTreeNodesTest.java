package com.leetcode.L0222;

import com.util.TreeNode;

public class CountCompleteTreeNodesTest {
    public static void main(String[] args) {
        CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();
        /**
         * 示例:
         * 输入:
         *     1
         *    / \
         *   2   3
         *  / \  /
         * 4  5 6
         * 输出: 6
         */
        TreeNode root = new TreeNode(1);
        TreeNode rl = new TreeNode(2);
        TreeNode rr = new TreeNode(3);
        TreeNode rll = new TreeNode(4);
        TreeNode rlr = new TreeNode(5);
        TreeNode rrl = new TreeNode(6);

        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;
        rr.left = rrl;
        //方法一：递归
        System.out.println(countCompleteTreeNodes.countNodes(root));
        //方法二：利用完全二叉树性质
        System.out.println(countCompleteTreeNodes.countNodes_CT(root));

    }
}
