package com.leetcode.L101_200.L0144;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class PerOrder {
    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode<Integer> root) {
        //结果变量
        List<Integer> res = new ArrayList<>();
        //空值情况
        if(root == null){
            return res;
        }
        //调用前序遍历函数
        perOrder(root,res);
        return res;
    }

    /**
     * 前序遍历函数
     * @param root 当前节点
     * @param res  结果List
     */
    public void perOrder(TreeNode<Integer> root,List<Integer> res){
        if(root != null){
            //将当前节点加入list
            res.add(root.val);
            //走向左子树
            perOrder(root.left,res);
            //走向右子树
            perOrder(root.right,res);
        }
    }

    /**
     * 方法二：迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal_Iteration(TreeNode<Integer> root) {
        //结果变量
        List<Integer> res = new ArrayList<>();
        //空值情况
        if(root == null){
            return res;
        }
        //存储节点栈
        Stack<TreeNode> stack = new Stack<>();
        //当栈或者节点不为空进入循环
        while(!stack.isEmpty() || root != null){
            //向左子树走
            while(root != null){
                //将当前节点的值加入list
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            //弹出栈顶节点
            root = stack.pop();
            //走向右子树
            root = root.right;
        }
        return res;
    }

}
