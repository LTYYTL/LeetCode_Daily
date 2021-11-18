package com.leetcode.L1301_1400.L1382;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1382. 将二叉搜索树变平衡
 * 给你一棵二叉搜索树，请你返回一棵 平衡后 的二叉搜索树，新生成的树应该与原来的树有着相同的节点值。
 * 如果一棵二叉搜索树中，每个节点的两棵子树高度差不超过 1 ，我们就称这棵二叉搜索树是 平衡的 。
 * 如果有多种构造方法，请你返回任意一种。
 *
 * 示例：
 * 输入：root = [1,null,2,null,3,null,4,null,null]
 * 输出：[2,1,3,null,null,null,4]
 * 解释：这不是唯一的正确答案，[3,1,4,null,2,null,null] 也是一个可行的构造方案。
 */
public class BalanceBinarySearchTree {
    List<Integer> list = new ArrayList<>();

    /**
     * 方法：递归
     * @param root
     * @return
     */
    public TreeNode balanceBST(TreeNode root) {
        //中序遍历获取有序数组
        order(root);
        //通过有序数组构建平衡二叉树
        return getTree(list,0,list.size()-1);
    }

    /**
     * 用分治构建树（第108题）
     * @param list
     * @param left
     * @param right
     * @return
     */
    private TreeNode getTree(List<Integer> list, int left, int right) {
        if (left > right)
            return null;

        int mid = (right - left)/2 + left;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = getTree(list,left,mid-1);
        root.right = getTree(list,mid+1,right);

        return root;
    }

    /**
     * 中序遍历
     * @param root
     */
    private void order(TreeNode<Integer> root) {
        if (root != null){
            order(root.left);
            list.add(root.val);
            order(root.right);
        }
    }
}
