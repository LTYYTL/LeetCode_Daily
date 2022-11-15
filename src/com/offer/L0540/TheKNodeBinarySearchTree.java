package com.offer.L0540;

import com.util.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 * 示例 1:
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 *
 * 示例 2:
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 *
 * 限制：
 * 1 ≤ k ≤ 二叉搜索树元素个数
 */
public class TheKNodeBinarySearchTree {
    int res,k;

    /**
     * 方法：递归
     */
    public int kthLargest(TreeNode root, int k) {
        //k作为全局变量
        this.k = k;
        dfs(root);
        return res;
    }

    /**
     * 反向中序遍历
     */
    private void dfs(TreeNode root) {
        if (root == null) return;
        //右子树
        dfs(root.right);
        //满足条件直接跳出
        if (k == 0) return;
        //第k大值
        if (--k == 0) res = root.val;
        //左子树
        dfs(root.left);
    }
}
