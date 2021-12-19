package com.leetcode.L1_100.L0096;

/**
 * 96. 不同的二叉搜索树
 * 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
 *
 * 示例 1：
 * 输入：n = 3
 * 输出：5
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：1
 *
 * 提示：
 * 1 <= n <= 19
 */
public class UniqueBST {
    //备忘录
    private int[][] mono;

    /**
     * 方法：递归
     * @param n
     * @return
     */
    public int numTrees(int n) {
        //备忘录初始化为0
        mono = new int[n+1][n+1];
        //递归
        return count(1,n);
    }

    private int count(int low, int high) {
        if (low > high)
            return 1;
        //查看是否存在
        if (mono[low][high] != 0)
            return mono[low][high];
        //结果
        int res = 0;
        //遍历
        for (int i = low; i <= high; i++) {
            //左边组成的次数
            int left = count(low,i-1);
            //右边组成的次数
            int right = count(i+1,high);
            //总次数
            res += left * right;
        }
        //记录次数
        mono[low][high] = res;

        return res;
    }
}
