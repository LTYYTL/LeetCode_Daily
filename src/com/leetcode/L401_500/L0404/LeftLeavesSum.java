package com.leetcode.L401_500.L0404;

import com.util.TreeNode;

/**
 * 404. 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class LeftLeavesSum {
    /**
     * 方法：递归
     */
    public int sumOfLeftLeaves(TreeNode root) {
        //调用深度优先搜索
        return dfs(root, false);

    }

    /**
     * 深度优先搜索
     *
     * @param root  当前节点
     * @param state 区分左右节点
     */
    private int dfs(TreeNode root, boolean state) {
        //当前节点为空，直接返回0
        if (root == null)
            return 0;
        //当前节点没有左、右子树，且是左叶子节点，返回其节点值
        if (root.left == null && root.right == null && state) {
            return root.val;
        }
        //递归调用，进入左子树找寻左子树的左叶子节点，进入右子树找寻右子树的左叶子节点
        return dfs(root.left, true) + dfs(root.right, false);

    }
}
