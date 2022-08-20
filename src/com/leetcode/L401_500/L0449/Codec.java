package com.leetcode.L401_500.L0449;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 449. 序列化和反序列化二叉搜索树
 * 序列化是将数据结构或对象转换为一系列位的过程，以便它可以存储在文件或内存缓冲区中，或通过网络连接链路传输，以便稍后在同一个或另一个计算机环境中重建。
 * 设计一个算法来序列化和反序列化 二叉搜索树 。 对序列化/反序列化算法的工作方式没有限制。 您只需确保二叉搜索树可以序列化为字符串，并且可以将该字符串反序列化为最初的二叉搜索树。
 * 编码的字符串应尽可能紧凑。
 * <p>
 * 示例 1：
 * 输入：root = [2,1,3]
 * 输出：[2,1,3]
 * <p>
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 * <p>
 * 提示：
 * 树中节点数范围是 [0, 104]
 * 0 <= Node.val <= 104
 * 题目数据 保证 输入的树是一棵二叉搜索树。
 */
public class Codec {
    /**
     * 方法：后序遍历
     *
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        //结果
        List<Integer> list = new ArrayList<>();
        //后序遍历
        postOrder(root, list);
        //转换成字符串
        String res = list.toString();
        //去除无用部分
        return res.substring(1, res.length() - 1);
    }


    public TreeNode deserialize(String data) {
        //空值
        if (data.isEmpty()) {
            return null;
        }

        //切分数组
        String[] roots = data.split(", ");
        //存储
        Stack<Integer> stack = new Stack<>();
        for (String root : roots) {
            stack.push(Integer.valueOf(root));
        }
        //递归
        return construct(Integer.MIN_VALUE, Integer.MAX_VALUE, stack);

    }

    private TreeNode construct(int lower, int high, Stack<Integer> stack) {
        //当前是否还存在值或者不在当前子树下
        if (stack.isEmpty() || stack.peek() < lower || stack.peek() > high)
            return null;
        //栈顶
        int val = stack.pop();
        //构建树
        TreeNode<Integer> root = new TreeNode<>(val);
        root.right = construct(val, high, stack);
        root.left = construct(lower, val, stack);
        return root;
    }

    private void postOrder(TreeNode<Integer> root, List<Integer> list) {
        if (root == null)
            return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
