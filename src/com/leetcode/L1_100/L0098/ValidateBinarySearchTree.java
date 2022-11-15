package com.leetcode.L1_100.L0098;

import com.util.TreeNode;

/**
 * 98. 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 示例 1:
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 *
 * 示例 2:
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class ValidateBinarySearchTree {
    /**
     * 方法：递归
     */
    public boolean isValidBST(TreeNode root) {
        //递归调用
        return isBST(root, null, null);
    }

    /**
     * @param root     当前节点
     * @param minValue 最小值
     * @param maxValue 最大值
     */
    private boolean isBST(TreeNode root, Integer minValue, Integer maxValue) {
        // 空树认为是BST
        if (root == null) {
            return true;
        }
        // 一次只检查一个节点，看这个节点是否破坏了BST特性
        if (minValue != null && root.val <= minValue) {
            return false;
        }
        if (maxValue != null && root.val >= maxValue) {
            return false;
        }
        // 对于左子树的所有节点值来说，最小值为min，最大值为root.val
        // 对于右子树的所有节点值来说，最小值为root.val，最大值为max
        return isBST(root.left, minValue, root.val) && isBST(root.right, root.val, maxValue);
    }
}
