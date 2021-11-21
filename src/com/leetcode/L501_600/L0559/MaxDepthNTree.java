package com.leetcode.L501_600.L0559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 559. N 叉树的最大深度
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
 *
 * 示例 1：
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：3
 *
 * 示例 2：
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：5
 *
 * 提示：
 * 树的深度不会超过 1000 。
 * 树的节点数目位于 [0, 104] 之间。
 */
public class MaxDepthNTree {
    /**
     * 方法一：广度优先搜索
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        //空值情况
        if(root == null)
            return 0;
        //存入节点
        Queue<Node> queue = new LinkedList<>();
        //根节点入队
        queue.add(root);

        //层数
        int step = 0;
        //遍历
        while (!queue.isEmpty()){
            //当前层的节点数
            int size = queue.size();
            //遍历层
            for (int i = 0; i < size; i++) {
                //队首节点
                Node cur = queue.poll();
                List<Node> children = cur.children;
                //它的孩子入队
                for (Node child : children) {
                    queue.add(child);
                }
            }
            //层数+1
            step++;
        }
        return step;
    }

    /**
     * 方法二：深度优先搜索
     * @param root
     * @return
     */
    public int maxDepth_dfs(Node root) {
        //空值情况
        if(root == null)
            return 0;
        //最大深度
        int max = 0;
        //遍历孩子
        for (Node child : root.children) {
            //孩子的最大深度
            int maxChild = maxDepth_dfs(child);
            //取最大
            max = Math.max(maxChild,max);
        }
        //最大深度+1
        return max+1;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
