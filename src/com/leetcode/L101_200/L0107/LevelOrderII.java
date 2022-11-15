package com.leetcode.L101_200.L0107;

import com.util.TreeNode;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class LevelOrderII {
    /**
     * 方法一：广度优先遍历
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //空树
        if (root == null){
            return res;
        }
        //节点队列
        Queue<TreeNode> queue = new LinkedList<>();
        //将根节点添加到队列
        queue.add(root);
        //队列为空，跳出循环
        while (!queue.isEmpty()){
            //获得当前队列的长度，即本层的节点数
            int size = queue.size();
            //临时变量
            List<Integer> list = new ArrayList<>();
            //将本层节点循环输出
            for (int i = 0; i < size; i++){
                //获得当前队首节点
                TreeNode temp = queue.poll();
                list.add(temp.val);
                //将当前节点的孩子放入队列中
                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
            res.add(list);
        }
        //反转
        Collections.reverse(res);
        return res;
    }


}
