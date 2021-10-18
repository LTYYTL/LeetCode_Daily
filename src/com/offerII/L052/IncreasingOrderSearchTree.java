package com.offerII.L052;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer II 052. 展平二叉搜索树
 * 给你一棵二叉搜索树，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 *
 * 示例 1：
 * 输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
 * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 *
 * 示例 2：
 * 输入：root = [5,1,7]
 * 输出：[1,null,5,null,7]
 *
 * 提示：
 * 树中节点数的取值范围是 [1, 100]
 * 0 <= Node.val <= 1000
 */
public class IncreasingOrderSearchTree {
    //中序遍历顺序
    List<TreeNode> list = new ArrayList<>();

    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        //哑节点
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        //改变树结构
        for (TreeNode treeNode : list) {
            cur.right = treeNode;
            treeNode.left = null;
            cur = treeNode;
        }
        return dummy.right;
    }

    /**
     * 中序遍历
     * @param root
     */
    private void inOrder(TreeNode root) {
        if (root != null){
            inOrder(root.left);
            list.add(root);
            inOrder(root.right);
        }
    }

    /**
     * 方法二：迭代
     * @param root
     * @return
     */
    public  TreeNode increasingBST_it(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()){
            //将左节点全部加入栈中
            while (root != null){
                stack.add(root);
                root = root.left;
            }

            root = stack.removeLast();
            //将当前节点记入list
            list.add(root);
            root = root.right;
        }
        //哑节点
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        //改变树结构
        for (TreeNode treeNode : list) {
            cur.right = treeNode;
            treeNode.left = null;
            cur = treeNode;
        }
        return dummy.right;
    }
}
