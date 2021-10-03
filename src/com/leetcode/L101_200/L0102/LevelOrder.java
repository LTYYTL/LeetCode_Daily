package com.leetcode.L101_200.L0102;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按层序遍历得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class LevelOrder {
    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        //结果list
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (root == null)
            return res;
        //调用函数，根节点在0层
        return levelOrder(root,0,res);
    }

    /**
     *
     * @param root  当前节点
     * @param level 层数
     * @param res   结果list
     * @return
     */
    private List<List<Integer>> levelOrder(TreeNode<Integer> root, int level, List<List<Integer>> res) {
        //节点为空
        if (root == null)
            return res;
        //当前list长度等于当前层数，
        //因为是从0开始的，当层数为2时，list中已经存在0层，1层，没有2层，但list长度为2
        //在list中加入层的list
        if (res.size() == level){
            res.add(new ArrayList<>());
        }
        //将当前节点的val值添加到其所在层的list中
        res.get(level).add(root.val);
        //左子树，层数+1
        levelOrder(root.left, level+1, res);
        //右子树，层数+1
        levelOrder(root.right, level+1,res);
        return res;
    }

    /**
     * 方法二：广度优先搜索
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder_BFS(TreeNode<Integer> root){
        //结果list
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (root == null)
            return res;
        //节点队列
        Queue<TreeNode> queue = new LinkedList<>();
        //将根节点加入节点队列
        queue.add(root);
        //队列为空，跳出循环
        while(!queue.isEmpty()){
            //获得当前队列的长度，即本层的节点数
            int size = queue.size();
            //临时变量
            List<Integer> list = new ArrayList<>();
            //将本层节点循环输出
            for (int i = 0; i < size; i++){
                //获得当前队首节点
                TreeNode<Integer> temp = queue.poll();
                list.add(temp.val);
                //将当前节点的孩子放入队列中
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
