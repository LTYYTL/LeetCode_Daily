package com.leetcode.L0814;

import com.util.TreeNode;

/**
 * 814. 二叉树剪枝
 * 给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。
 * 返回移除了所有不包含 1 的子树的原二叉树。
 * ( 节点 X 的子树为 X 本身，以及所有 X 的后代。)
 *
 * 示例1:
 * 输入: [1,null,0,0,1]
 * 输出: [1,null,0,null,1]
 *
 * 示例2:
 * 输入: [1,0,1,0,0,0,1]
 * 输出: [1,null,1,null,1]
 *
 * 示例3:
 * 输入: [1,1,0,1,1,0,1,0]
 * 输出: [1,1,0,1,1,null,1]
 *
 * 说明:
 * 给定的二叉树最多有 100 个节点。
 * 每个节点的值只会为 0 或 1 。
 */
public class BinaryTreePruning {
    /**
     * 方法：递归
     * @param root
     * @return
     */
    public TreeNode pruneTree(TreeNode root) {
        return del(root);
    }

    /**
     * 删除函数
     * @param root
     * @return
     */
    private TreeNode del(TreeNode<Integer> root) {
        //空值情况
        if (root == null)
            return null;
        //左子树
        root.left = del(root.left);
        //右子树
        root.right = del(root.right);
        //左子树、右子树、值为0表示此点无效可以删除
        if (root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
}
