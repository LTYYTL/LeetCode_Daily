package com.leetcode.L901_1000.L0965;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 965. 单值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * <p>
 * 示例 1：
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * <p>
 * 示例 2：
 * 输入：[2,2,2,5,2]
 * 输出：false
 * <p>
 * 提示：
 * 给定树的节点数范围是 [1, 100]。
 * 每个节点的值都是整数，范围为 [0, 99] 。
 */
public class UnivaluedBinaryTree {
    /**
     * 方法：广度优先搜索
     */
    public boolean isUnivalTree(TreeNode root) {
        //空值
        if (root == null)
            return false;
        //树值
        int val = root.val;
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        //入队
        queue.add(root);

        //遍历
        while (!queue.isEmpty()) {
            //队首元素
            TreeNode cur = queue.poll();
            //不是单值
            if (cur.val != val)
                return false;
            //有左子树
            if (cur.left != null) {
                queue.add(cur.left);
            }
            //有右子树
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return true;
    }
}
