package com.leetcode.L0094;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class InOrder {
    /**
     * 方法一：递归
     */
    public List<Integer> inorderTraversal(TreeNode<Integer> root) {
        //结果list
        List<Integer> res = new ArrayList<>();
        //空树情况
        if (root == null)
            return res;
        //调用中序遍历函数
        inorder(root,res);
        return res;
    }

    /**
     * 中序遍历
     * @param root
     * @param res
     */
    private void inorder(TreeNode<Integer> root, List<Integer> res) {
        //节点不为空
        if (root != null){
            //中序遍历左子树
            inorder(root.left,res);
            //没有左子树，直接存入list
            res.add(root.val);
            //中序遍历右子树
            inorder(root.right,res);
        }
    }

    /**
     * 方法二：迭代
     */
    public List<Integer> inorderTraversal_NonRecursive(TreeNode<Integer> root) {
        //结果list
        List<Integer> res = new ArrayList<>();
        //空树情况
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        while(root !=null || !stack.isEmpty()){
            //将左节点全部加入栈中
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //将当前节点记入list
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

}
