package com.leetcode.L501_600.L0530;

import com.util.TreeNode;

import java.util.Stack;

/**
 * 530. 二叉搜索树的最小绝对差
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 *
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
 *
 * 提示：
 * 树中至少有 2 个节点。
 * 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/ 相同
 */
public class BSTMin {
    //差值的最小值
    int min = Integer.MAX_VALUE;
    //前一个节点
    TreeNode<Integer> prev;

    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode<Integer> root) {
        //边界条件判断
        if (root == null)
            return;
        //左子树
        inorder(root.left);
        //对当前节点的操作
        if (prev != null)
            min = Math.min(min, root.val - prev.val);
        prev = root;
        //右子树
        inorder(root.right);
    }

    /**
     * 方法二：递归
     * @param root
     * @return
     */
    public int getMinimumDifference_Iteration(TreeNode<Integer> root) {
        int min = Integer.MAX_VALUE;
        TreeNode<Integer> pre;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null)
                min = Math.min(min, root.val - prev.val);
            prev = root;
            root = root.right;
        }
        return min;
    }
}
