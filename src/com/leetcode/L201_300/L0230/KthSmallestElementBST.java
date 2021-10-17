package com.leetcode.L201_300.L0230;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 230. 二叉搜索树中第K小的元素
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 *
 * 示例 1：
 * 输入：root = [3,1,4,null,2], k = 1
 * 输出：1
 *
 * 示例 2：
 * 输入：root = [5,3,6,2,4,null,null,1], k = 3
 * 输出：3
 *
 * 提示：
 * 树中的节点数为 n 。
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 *
 * 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？
 */
public class KthSmallestElementBST {
    /**
     * 方法一：递归
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode<Integer> root, int k) {
        List<Integer> list = new ArrayList<>();
        order(root,list);
        return list.get(k-1);
    }

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    private void order(TreeNode<Integer> root, List<Integer> list) {
        if (root == null)
            return;
        order(root.left,list);
        list.add(root.val);
        order(root.right,list);
    }

    /**
     * 方法二：迭代
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest_iteration(TreeNode<Integer> root, int k) {
        Stack<TreeNode> stake = new Stack<>();
        while (root != null || !stake.isEmpty()){
            //寻找最小左孩子
            while (root != null){
                stake.push(root);
                root = root.left;
            }
            root = stake.pop();
            --k;
            if (k == 0)
                break;
            root = root.right;
        }

        return root.val;
    }
}
