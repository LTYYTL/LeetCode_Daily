package com.leetcode.L501_600.L0589;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的 前序遍历 。
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 *
 * 进阶：
 * 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 示例 1：
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[1,3,5,6,2,4]
 *
 * 示例 2：
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：[1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 *
 * 提示：
 * N 叉树的高度小于或等于 1000
 * 节点总数在范围 [0, 10^4] 内
 */
public class NTreePreTraversal {
    private List<Integer> res;

    /**
     * 方法：递归
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        res = new ArrayList<>();
        //前序遍历
        pro(root);
        return res;
    }

    private void pro(Node root) {
        //空值
        if (root == null){
            return;
        }
        //加入集合
        res.add(root.val);
        //遍历子节点
        for (Node child : root.children) {
            pro(child);
        }
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