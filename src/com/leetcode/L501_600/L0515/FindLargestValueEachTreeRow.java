package com.leetcode.L501_600.L0515;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. 在每个树行中找最大值
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 *
 * 示例1：
 * 输入: root = [1,3,2,5,3,null,9]
 * 输出: [1,3,9]
 * 解释:
 *           1
 *          / \
 *         3   2
 *        / \   \
 *       5   3   9
 *
 * 示例2：
 * 输入: root = [1,2,3]
 * 输出: [1,3]
 * 解释:
 *           1
 *          / \
 *         2   3
 * 示例3：
 * 输入: root = [1]
 * 输出: [1]
 *
 * 示例4：
 * 输入: root = [1,null,2]
 * 输出: [1,2]
 * 解释:
 *            1
 *             \
 *              2
 *
 * 示例5：
 * 输入: root = []
 * 输出: []
 *
 * 提示：
 *
 * 二叉树的节点个数的范围是 [0,104]
 * -231 <= Node.val <= 231 - 1
 */
public class FindLargestValueEachTreeRow {
    /**
     * 方法：广度优先搜索
     */
    public List<Integer> largestValues(TreeNode root) {
        //结果集
        List<Integer> res = new ArrayList<>();
        //空置情况
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //遍历
        while (!queue.isEmpty()){
            //当前层节点个数
            int size = queue.size();
            //最大值
            int max = Integer.MIN_VALUE;
            //遍历层内节点
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
                max = Math.max(max,cur.val);
            }
            //添加最大值
            res.add(max);
        }

        return res;
    }
}
