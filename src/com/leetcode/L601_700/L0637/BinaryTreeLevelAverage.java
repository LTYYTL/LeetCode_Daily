package com.leetcode.L601_700.L0637;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637. 二叉树的层平均值
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 *
 * 示例 1：
 * 输入：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出：[3, 14.5, 11]
 * 解释：
 * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
 *
 * 提示：
 * 节点值的范围在32位有符号整数范围内。
 */
public class BinaryTreeLevelAverage {
    /**
     * 方法：广度优先搜索
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        //空树
        if (root == null)
            return res;
        //节点队列
        Queue<TreeNode> queue = new LinkedList<>();
        //将根节点添加到队列
        queue.add(root);
        //队列为空，跳出循环
        while(!queue.isEmpty()){
            //本层节点值和
            double sum = 0;
            //获得当前队列的长度，即本层的节点数
            int size = queue.size();
            //将本层节点循环输出
            for (int i = 0; i < size; i++){
                //获得当前队首节点
                TreeNode temp = queue.poll();
                double num = temp.val;
                sum += num;
                //将当前节点的孩子放入队列中
                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
            //本层平均值加入list
            res.add(sum/size);
        }
        return res;
    }
}
