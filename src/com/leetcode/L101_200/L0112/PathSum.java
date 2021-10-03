package com.leetcode.L101_200.L0112;

import com.util.TreeNode;


import java.util.Stack;

/**
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 */
public class PathSum {
    /**
     * 方法一：dfs
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum_dfs(TreeNode root, int sum) {
        if(root == null)
            return false;
        //调用深度优先搜索
        return dfs(root,sum);
    }

    /**
     * 深度优先搜索
     * @param root
     * @param sum
     * @return
     */
    private boolean dfs(TreeNode<Integer> root, int sum) {
        int temp = 0;
        //节点栈
        Stack<TreeNode> stack = new Stack<>();
        //节点值和栈
        Stack<Integer> sumStack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            //节点不为空
            while (root != null){
                //将当前节点压入栈
                stack.push(root);
                //节点和值
                temp += root.val;
                //将到当前节点的和加入栈中
                sumStack.push(temp);
                //走向左子树
                root = root.left;
            }
            //节点为空获得其父节点
            root= stack.pop();
            //到父节点的和值
            temp = sumStack.pop();
            //此点为叶子节点，和值满足条件
            if (root.left == null && root.right == null && temp == sum){
                return true;
            }
            //走向右子树
            root = root.right;
        }
        return false;
    }

    public boolean hasPathSum(TreeNode<Integer> root, int sum) {
        if(root == null)
            return false;
        //到达叶子节点
        if (root.left == null && root.right == null)
            return sum == root.val;
        //没有到达叶子节点，继续在左右子树寻找，只要在一边找到就可以
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
