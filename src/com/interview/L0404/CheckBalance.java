package com.interview.L0404;

import com.util.TreeNode;

/**
 * 面试题 04.04. 检查平衡性
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
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
 *       1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * 返回 false 。
 */
public class CheckBalance {
    /**
     * 方法：递归
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        //分别计算左子树和右子树的高度
        int left = depth(root.left);
        int right = depth(root.right);
        //这两个子树的高度不能超过1，并且他的两个子树也必须是平衡二叉树
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    //计算树中节点的高度
    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
