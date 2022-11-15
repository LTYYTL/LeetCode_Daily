package com.leetcode.L901_1000.L0938;

import com.util.TreeNode;

import java.util.Stack;

/**
 * 938. 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 *
 * 示例 1：
 * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
 * 输出：32
 *
 * 示例 2：
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 * 输出：23
 *
 * 提示：
 * 树中节点数目在范围 [1, 2 * 104] 内
 * 1 <= Node.val <= 105
 * 1 <= low <= high <= 105
 * 所有 Node.val 互不相同
 */
public class RangeSumBST {
    /**
     * 方法一：递归
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        //当前值比范围小，走向右子树
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        //当前值比范围大，走向左子树
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        //当前值+左子树的和+右子树的和
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    /**
     * 方法二：迭代
     */
    public int rangeSumBST_it(TreeNode root, int low, int high) {
        //结果集
        int sum = 0;
        //空值情况
        if (root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        //将左节点放入栈中
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            //取出栈顶节点
            root = stack.pop();
            //判断其值是否在范围内
            if (low <= root.val && root.val <= high)
                sum += root.val;

            //走向右子树
            root = root.right;
        }
        return sum;
    }
}
