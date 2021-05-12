package com.leetcode.L0111;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 *
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 *
 * 示例 2：
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 *
 * 提示：
 * 树中节点数的范围在 [0, 105] 内
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthBinaryTree {
    /**
     * 方法一：广度优先遍历
     * @param root
     * @return
     */
    public int minDepth(TreeNode<Integer> root){
        //空值情况
        if (root == null)
            return 0;

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        //root本身就是一层，将depth初始化为1
        int depth = 1;

        while (!queue.isEmpty()){
            int size = queue.size();
            //将当前队列中所有节点的孩子加入队列
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> cur = queue.poll();
                //判断是否到终点
                if (cur.left == null && cur.right == null)
                    return depth;
                //将左子树加入队列
                if (cur.left != null)
                    queue.offer(cur.left);
                //将右子树加入队列
                if (cur.right != null)
                    queue.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }
}
