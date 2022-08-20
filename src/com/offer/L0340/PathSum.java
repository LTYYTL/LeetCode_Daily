package com.offer.L0340;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 target = 22，
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * 提示：
 * 节点总数 <= 10000
 * 注意：本题与主站 113 题相同：<a href="https://leetcode-cn.com/problems/path-sum-ii/">https://leetcode-cn.com/problems/path-sum-ii/</a>
 */
public class PathSum {
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
