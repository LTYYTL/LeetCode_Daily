package com.leetcode.L0104;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class BinaryTreeDepth {
    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //空值情况
        if (root == null)
            return 0;
        //递归调用，左子树和右子树中最大的深度
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;

    }

    /**
     * 方法二：深度优先搜索
     * @param root
     * @return
     */
    public int maxDepth_DFS(TreeNode root){
        //空值情况
        if (root == null)
            return 0;
        //stack记录的是节点，而level中的元素和stack中的元素
        //是同时入栈同时出栈，并且level记录的是节点在第几层
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        Stack<Integer> level = new Stack<>();
        level.add(1);
        //最大深度
        int depth = 0;
        while (!stack.isEmpty()){
            //stack中的元素和level中的元素同时出栈
            TreeNode treeNode = stack.pop();
            int temp = level.pop();
            //记录最大深度
            depth = Math.max(temp,depth);
            //右子树不为空，压入stack栈，将其所在层压入level栈
            if (treeNode.right != null){
                stack.add(treeNode.right);
                level.add(temp+1);
            }
            //左子树不为空，压入stack栈，将其所在层压入level栈
            if (treeNode.left != null){
                stack.add(treeNode.left);
                level.add(temp+1);
            }
        }
        return depth;
    }

    /**
     * 方法三：广度优先搜索
     * @param root
     * @return
     */
    public int maxDepth_BFS(TreeNode root){
        //空值情况
        if (root == null)
            return 0;
        //最大深度
        int depth = 0;
        //创建一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            //每层个数
            int size = queue.size();
            //把本层都遍历完成，将其的左右子树添加到队列中
            while(size>0){
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
                size--;
            }
            //每层完事后，深度+1
            depth++;
        }
        return depth;
    }
}
