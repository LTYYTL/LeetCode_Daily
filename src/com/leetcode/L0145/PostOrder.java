package com.leetcode.L0145;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class PostOrder {
    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        //结果list
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        //调用后序遍历函数
        postOrder(root,res);
        return res;
    }

    /**
     * 后序遍历
     * @param root
     * @param res
     */
    private void postOrder(TreeNode<Integer> root,List<Integer> res){
        if(root != null){
            //走向左子树
            postOrder(root.left,res);
            //走向右子树
            postOrder(root.right,res);
            //将当前节点的值加入list
            res.add(root.val);
        }
    }

    /**
     * 方法二：迭代
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal_Iteration(TreeNode<Integer> root){
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode last = null;
        while (root != null || ! stack.isEmpty()) {
            if (root != null) {
                //当前节点入栈
                stack.push(root);
                //遍历左子树
                root = root.left;
            } else {
                TreeNode<Integer> data = stack.peek();
                //右子树为空，或者右子树已经遍历过（因为当前节点的右节点等于上一次遍历到的节点）
                if (data.right == null || last == data.right) {
                    //左右子树遍历结束，当前节点存入结果集
                    result.add(data.val);
                    //将当前节点置为最后一次访问的节点
                    last = data;
                    //将当前节点从栈中弹出
                    stack.pop();
                } else {
                    //遍历右子树
                    root = data.right;
                }
            }
        }
        return result;
    }
}
