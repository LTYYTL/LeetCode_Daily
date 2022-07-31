package com.leetcode.L1101_1200.L1161;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1161. 最大层内元素和
 * 给你一个二叉树的根节点 root。设根节点位于二叉树的第 1 层，而根节点的子节点位于第 2 层，依此类推。
 * 请返回层内元素之和 最大 的那几层（可能只有一层）的层号，并返回其中 最小 的那个。
 * <p>
 * 示例 1：
 * 输入：root = [1,7,0,7,-8,null,null]
 * 输出：2
 * 解释：
 * 第 1 层各元素之和为 1，
 * 第 2 层各元素之和为 7 + 0 = 7，
 * 第 3 层各元素之和为 7 + -8 = -1，
 * 所以我们返回第 2 层的层号，它的层内元素之和最大。
 * <p>
 * 示例 2：
 * 输入：root = [989,null,10250,98693,-89388,null,null,null,-32127]
 * 输出：2
 * <p>
 * 提示：
 * 树中的节点数在 [1, 104]范围内
 * -105 <= Node.val <= 105
 */
public class MaxLevelSumTree {
    /**
     * 方法：广度优先搜索
     *
     * @param root
     * @return
     */
    public int maxLevelSum(TreeNode root) {
        //结果
        int res = 0;
        //最大和
        int max = Integer.MIN_VALUE;
        //存放每层节点
        Queue<TreeNode> queue = new LinkedList<>();
        //放入根节点
        queue.add(root);

        //层数
        int level = 1;
        //遍历
        while (!queue.isEmpty()) {
            //每层的节点个数
            int size = queue.size();
            //节点和
            int sum = 0;
            //遍历层
            for (int i = 0; i < size; i++) {
                //当前节点
                TreeNode<Integer> cur = queue.poll();
                //左节点存在
                if (cur.left != null)
                    queue.add(cur.left);
                //右节点存在
                if (cur.right != null)
                    queue.add(cur.right);
                //计算当前层节点和
                sum += cur.val;
            }
            //记录最大和值和所在层数
            if (sum > max) {
                res = level;
                max = sum;
            }
            //层数+1
            level++;
        }

        return res;
    }
}
