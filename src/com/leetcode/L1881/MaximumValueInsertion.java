package com.leetcode.L1881;

/**
 * 1881. 插入后的最大值
 * 给你一个非常大的整数 n 和一个整数数字 x ，大整数 n 用一个字符串表示。n 中每一位数字和数字 x 都处于闭区间 [1, 9] 中，且 n 可能表示一个 负数 。
 * 你打算通过在 n 的十进制表示的任意位置插入 x 来 最大化 n 的 数值 。但 不能 在负号的左边插入 x 。
 * 例如，如果 n = 73 且 x = 6 ，那么最佳方案是将 6 插入 7 和 3 之间，使 n = 763 。
 * 如果 n = -55 且 x = 2 ，那么最佳方案是将 2 插在第一个 5 之前，使 n = -255 。
 * 返回插入操作后，用字符串表示的 n 的最大值。
 *
 * 示例 1：
 * 输入：n = "99", x = 9
 * 输出："999"
 * 解释：不管在哪里插入 9 ，结果都是相同的。
 *
 * 示例 2：
 * 输入：n = "-13", x = 2
 * 输出："-123"
 * 解释：向 n 中插入 x 可以得到 -213、-123 或者 -132 ，三者中最大的是 -123 。
 *
 * 提示：
 * 1 <= n.length <= 105
 * 1 <= x <= 9
 * n中每一位的数字都在闭区间 [1, 9] 中。
 * n 代表一个有效的整数。
 * 当 n 表示负数时，将会以字符 '-' 开始。
 */
public class MaximumValueInsertion {
    /**
     * 方法：贪心算法
     * @param n
     * @param x
     * @return
     */
    public String maxValue(String n, int x) {
        //用于记录正负数
        boolean flog = true;
        //结果
        StringBuilder res = new StringBuilder(n);
        //插入的索引,在都不符合条件时插入最后
        int index = n.length();
        //判断是正数还是负数
        if (n.charAt(0)=='-')
            flog = false;
        //正数与负数进入不同的计算
        if (flog){
            //正数：遍历字符串
            for (int i = 0; i < n.length(); i++) {
                //当前字符
                char c = n.charAt(i);
                //找到第一个比插入数字小的数，记录其索引
                if (x > c-'0'){
                    index = i;
                    break;
                }
            }
        }else {
            //负数：遍历字符串
            for (int i = 1; i < n.length(); i++) {
                //当前字符
                char c = n.charAt(i);
                //找到第一个比插入数字大的数，记录其索引
                if (x < c-'0'){
                    index = i;
                    break;
                }
            }
        }
        //将字符插入
        res.insert(index,x);
        return res.toString();
    }
}
