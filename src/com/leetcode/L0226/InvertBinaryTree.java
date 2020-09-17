package com.leetcode.L0226;

import com.util.TreeNode;

/**
 * 226. 翻转二叉树
 * 翻转一棵二叉树。
 *
 * 示例：
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 */
public class InvertBinaryTree {
    /**
     * 方法：递归
     * @param root 树
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        //空树情况
        if (root == null)
            return null;
        //调用反转函数
        invert(root);
        return root;
    }

    /**
     * 反转方法
     * @param root 节点
     */
    private void invert(TreeNode root) {
        //节点不为空进入循环
        if (root != null){
            //进入左子树反转
            invert(root.left);
            //进入右子树反转
            invert(root.right);
            //反转当前树
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
        }
    }
}
