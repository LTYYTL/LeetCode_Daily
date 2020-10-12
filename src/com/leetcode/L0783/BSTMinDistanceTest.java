package com.leetcode.L0783;

import com.util.TreeNode;

public class BSTMinDistanceTest {
    public static void main(String[] args) {
        BSTMinDistance bstMinDistance = new BSTMinDistance();
        /**
         * 示例：
         * 输入: root = [4,2,6,1,3,null,null]
         * 输出: 1
         * 解释:
         * 注意，root是树节点对象(TreeNode object)，而不是数组。
         * 给定的树 [4,2,6,1,3,null,null] 可表示为下图:
         *
         *           4
         *         /   \
         *       2      6
         *      / \
         *     1   3
         * 最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
         */
        TreeNode root = new TreeNode(4);
        TreeNode rl = new TreeNode(2);
        TreeNode rr = new TreeNode(6);
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(3);
        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;

        System.out.println(bstMinDistance.minDiffInBST(root));
    }
}
