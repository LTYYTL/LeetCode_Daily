package com.leetcode.L501_600.L0590;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 * 给定一个 N 叉树，返回其节点值的 后序遍历 。
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 *
 * 进阶：
 * 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 示例 1：
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[5,6,3,2,4,1]
 *
 * 示例 2：
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：[2,6,14,11,7,3,12,8,4,13,9,10,5,1]
 *
 * 提示：
 * N 叉树的高度小于或等于 1000
 * 节点总数在范围 [0, 10^4] 内
 */
public class NTreePostTraversal {
    private List<Integer> res;

    /**
     * 方法：递归
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();
        //后序遍历
        post(root);
        return res;
    }

    private void post(Node root) {
        //空值
        if (root == null){
            return;
        }

        //遍历子节点
        for (Node child : root.children) {
            post(child);
        }
        //加入集合
        res.add(root.val);
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