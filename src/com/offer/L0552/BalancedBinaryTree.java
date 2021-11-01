package com.offer.L0552;

import com.util.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 *
 * 限制：
 * 0 <= 树的结点个数 <= 10000
 * 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    /**
     * 方法：递归
     * @param root
     * @return
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
        if (Math.abs(leftHigh-rightHigh)>1)
            return false;
        return true;
    }

    /**
     * 计算深度
     * @param root
     * @return
     */
    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
