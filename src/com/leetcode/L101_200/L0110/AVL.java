package com.leetcode.L101_200.L0110;

import com.util.TreeNode;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
public class AVL {
    /**
     * 方法：递归
     */
    public boolean isBalanced(TreeNode root) {
        //空值情况
        if (root == null)
            return true;
        //左子树或右子树不为AVL树
        if (!isBalanced(root.left) || !isBalanced(root.right))
            return false;
        //左子树深度
        int leftHigh = depth(root.left) + 1;
        //右子树深度
        int rightHigh = depth(root.right) + 1;
        //深度差不在-1~1之间
        return Math.abs(leftHigh - rightHigh) <= 1;
    }

    /**
     * 计算深度
     */
    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
