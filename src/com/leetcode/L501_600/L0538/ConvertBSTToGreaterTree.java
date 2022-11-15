package com.leetcode.L501_600.L0538;

import com.util.TreeNode;

import java.util.Stack;

/**
 * 538. 把二叉搜索树转换为累加树
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 * 例如：
 * 输入: 原始二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 *
 * 注意：本题和 1038: <a href="https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/">https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/</a> 相同
 */
public class ConvertBSTToGreaterTree {
    /**
     * 方法一：递归（反向中序遍历）
     */
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        //节点不为空
        if (root != null) {
            //访问当前的节点的右子树，右子树的值大
            convertBST(root.right);
            //当前节点的值=右孩子的值+当前节点的值
            sum += root.val;
            root.val = sum;
            //访问当前的节点的左子树，左子树的值小
            convertBST(root.left);
        }
        return root;
    }


    /**
     * 方法二：迭代（反向中序遍历）
     */
    public TreeNode convertBST_Iteration(TreeNode root) {
        //用于中序遍历的栈
        Stack<TreeNode> stack = new Stack<>();
        TreeNode res = root;
        int pre = 0;

        while (!stack.isEmpty() || root != null) {
            //将右节点全部加入栈中
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            //当前节点的值=右孩子的值+当前节点的值
            root = stack.pop();
            pre += root.val;
            root.val = pre;
            root = root.left;
        }
        return res;
    }
}
