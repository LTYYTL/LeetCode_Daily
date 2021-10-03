package com.leetcode.L501_600.L0530;

import com.util.TreeNode;

public class BSTMinTest {
    public static void main(String[] args) {
        BSTMin bstMin = new BSTMin();
        /**
         * 示例：
         * 输入：
         *    1
         *     \
         *      3
         *     /
         *    2
         *
         * 输出：
         * 1
         * 解释：
         * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
         */
        TreeNode root = new TreeNode(1);
        TreeNode rr = new TreeNode(3);
        TreeNode rrl = new TreeNode(2);

        root.right = rr;
        rr.left = rrl;

        System.out.println(bstMin.getMinimumDifference(root));
        System.out.println(bstMin.getMinimumDifference_Iteration(root));
    }
}
