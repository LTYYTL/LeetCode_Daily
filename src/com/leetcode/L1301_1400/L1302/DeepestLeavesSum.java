package com.leetcode.L1301_1400.L1302;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1302. 层数最深叶子节点的和
 * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
 * <p>
 * 示例 1：
 * 输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * 输出：15
 * <p>
 * 示例 2：
 * 输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * 输出：19
 * <p>
 * 提示：
 * 树中节点数目在范围 [1, 104] 之间。
 * 1 <= Node.val <= 100
 */
public class DeepestLeavesSum {
    /**
     * 方法：广度优先搜索
     *
     * @param root
     * @return
     */
    public int deepestLeavesSum(TreeNode root) {
        // 结果
        int res = 0;
        // 空值情况
        if (root == null)
            return res;
        // 队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 计入根节点
        queue.add(root);

        //遍历
        while (!queue.isEmpty()) {
            // 当前层节点个数
            int size = queue.size();
            // 当前层节点和
            int sum = 0;
            // 遍历层中节点
            for (int i = 0; i < size; i++) {
                // 当前节点
                TreeNode<Integer> cur = queue.poll();
                // 有左子树
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                // 有右子树
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                // 计算和
                sum += cur.val;
            }
            res = sum;
        }

        return res;
    }
}
