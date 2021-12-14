package com.interview.L1712;

import com.util.TreeNode;

/**
 * 面试题 17.12. BiNode
 * 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。
 * 实现一个方法，把二叉搜索树转换为单向链表，要求依然符合二叉搜索树的性质，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
 *
 * 返回转换后的单向链表的头节点。
 * 注意：本题相对原题稍作改动
 *
 * 示例：
 * 输入： [4,2,5,1,3,null,6,0]
 * 输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]
 * 提示：
 *
 * 节点数量不会超过 100000。
 */
public class BiNode {
    //虚拟头节点
    TreeNode head = new TreeNode(-1);
    //前一个节点
    TreeNode pre = null;

    /**
     * 方法：递归
     * @param root
     * @return
     */
    public TreeNode convertBiNode(TreeNode root) {
        //中序遍历
        order(root);
        return head.right;
    }

    private void order(TreeNode root) {
        if (root != null){
            //进入左子树
            order(root.left);
            //第一个节点
            if (pre == null){
                //记录第一个节点
                pre = root;
                //作为单链表的头
                head.right = root;
            }else {
                //前一个节点的右指针指向当前节点
                pre.right = root;
                //指针后移
                pre = root;
            }
            //将左孩子为空
            root.left = null;
            //进入右子树
            order(root.right);
        }
    }
}
