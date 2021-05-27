package com.leetcode.L0461;

/**
 * 461. 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class HammingDistance {
    /**
     * 方法一：内置函数
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        //异或值
        int res = x^y;
        //计算异或值中1的个数
        return Integer.bitCount(res);
    }

    /**
     * 方法二：数学
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance_count(int x, int y) {
        //异或值
        int s = x^y;
        int res = 0;
        //计算异或值中1的个数
        while ( s != 0){
            res += s&1;
            s >>= 1;
        }


        return res;
    }
}
