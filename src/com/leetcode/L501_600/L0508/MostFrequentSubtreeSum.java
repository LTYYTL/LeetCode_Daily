package com.leetcode.L501_600.L0508;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 508. 出现次数最多的子树元素和
 * 给你一个二叉树的根结点 root ，请返回出现次数最多的子树元素和。如果有多个元素出现的次数相同，返回所有出现次数最多的子树元素和（不限顺序）。
 * 一个结点的 「子树元素和」 定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。
 * <p>
 * 示例 1：
 * 输入: root = [5,2,-3]
 * 输出: [2,-3,4]
 * <p>
 * 示例 2：
 * 输入: root = [5,2,-5]
 * 输出: [2]
 * <p>
 * 提示:
 * 节点数在 [1, 104] 范围内
 * -105 <= Node.val <= 105
 */
public class MostFrequentSubtreeSum {
    /**
     * 方法：深度优先搜索
     */
    //存储和值个数
    Map<Integer, Integer> map = new HashMap<>();
    //出现最多的次数
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        //深度优先搜索
        dfs(root);
        //结果
        List<Integer> list = new ArrayList<>();
        //遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == max)
                list.add(key);
        }

        //转换成数组
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * 深度优先搜索
     *
     * @param root
     * @return
     */
    private int dfs(TreeNode<Integer> root) {
        //空节点
        if (root == null)
            return 0;
        //计算和
        int sum = root.val + dfs(root.left) + dfs(root.right);
        //存储和h值的个数
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        //最大和值
        max = Math.max(map.get(sum), max);
        return sum;
    }
}
