package com.leetcode.L401_500.L0429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N 叉树的层序遍历
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 *
 * 示例 1：
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[[1],[3,2,4],[5,6]]
 *
 * 示例 2：
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：[[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
 *
 * 提示：
 * 树的高度不会超过 1000
 * 树的节点总数在 [0, 10^4] 之间
 */
public class NTreeLevelTraversal {
    /**
     * 方法：层序遍历
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        //结果集
        List<List<Integer>> res = new ArrayList<>();
        //空值
        if (root == null)
            return res;

        //队列
        Queue<Node> queue = new LinkedList<>();
        //加入根
        queue.add(root);

        //遍历
        while (!queue.isEmpty()) {
            //当前层的节点个数
            int size = queue.size();
            //当前层节点集合
            List<Integer> level = new ArrayList<>();
            //遍历
            for (int i = 0; i < size; i++) {
                //当前节点
                Node cur = queue.poll();
                //加入集合
                level.add(cur.val);
                //没有子节点
                if (cur.children == null)
                    continue;
                //遍历子节点
                for (Node child : cur.children) {
                    queue.add(child);
                }
            }
            //加入结果集
            res.add(level);
        }
        return res;
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


