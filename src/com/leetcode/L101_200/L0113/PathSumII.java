package com.leetcode.L101_200.L0113;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 113. 路径总和 II
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class PathSumII {
    //结果List
    List<List<Integer>> res = new ArrayList<>();
    //路径栈
    Stack<Integer> path = new Stack<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        //空值情况
        if (root == null){
            return res;
        }
        //深度优先搜索
        dfs(root,sum);
        return res;
    }

    /**
     * 深度优先搜素
     * @param root
     * @param sum
     */
    private void dfs(TreeNode<Integer> root, int sum) {
        //空值情况
        if (root == null)
            return;
        //当前节点压入栈中
        path.push(root.val);
        //从和中减去差值
        sum -= root.val;
        //满足条件的叶子节点，路径栈的数即为所求
        if (sum == 0 && root.left == null && root.right == null)
            res.add(new ArrayList<>(path));
        //走向左子树
        dfs(root.left,sum);
        //走向右子数
        dfs(root.right, sum);
        //将当前节点移除栈
        path.pop();
    }
}
