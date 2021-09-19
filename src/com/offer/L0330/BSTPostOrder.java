package com.offer.L0330;

import java.util.Stack;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 * 参考以下这颗二叉搜索树：
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 *
 * 示例 1：
 * 输入: [1,6,3,2,5]
 * 输出: false
 *
 * 示例 2：
 * 输入: [1,3,2,6,5]
 * 输出: true
 *
 * 提示：
 * 数组长度 <= 1000
 */
public class BSTPostOrder {
    /**
     * 方法一：递归
     * @param postorder
     * @return
     */
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    /**
     * 分治算法
     * @param postorder
     * @param i
     * @param j
     * @return
     */
    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j)
            return true;
        int p = i;
        //寻找第一个比根节点大的元素
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        //寻找第一个比根小的元素
        while (postorder[p] > postorder[j]) p++;
        //分别判断[i,m-1]与[m,j-1]区间
        return p == j && recur(postorder, i, m-1) && recur(postorder, m, j-1);
    }

    /**
     * 方法二：单调栈
     * @param postorder
     * @return
     */
    public boolean verifyPostorder_stack(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root) return false;
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
}
