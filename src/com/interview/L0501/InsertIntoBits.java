package com.interview.L0501;

/**
 * 面试题 05.01. 插入
 * 给定两个整型数字 N 与 M，以及表示比特位置的 i 与 j（i <= j，且从 0 位开始计算）。
 * 编写一种方法，使 M 对应的二进制数字插入 N 对应的二进制数字的第 i ~ j 位区域，不足之处用 0 补齐。具体插入过程如图所示。
 * 题目保证从 i 位到 j 位足以容纳 M， 例如： M = 10011，则 i～j 区域至少可容纳 5 位。
 *
 * 示例1:
 *  输入：N = 1024(10000000000), M = 19(10011), i = 2, j = 6
 *  输出：N = 1100(10001001100)
 *
 * 示例2:
 *  输入： N = 0, M = 31(11111), i = 0, j = 4
 *  输出：N = 31(11111)
 */
public class InsertIntoBits {
    /**
     * 方法：位运算
     * @param N
     * @param M
     * @param i
     * @param j
     * @return
     */
    public int insertBits(int N, int M, int i, int j) {
        //左部分，只要j左边的部分，其他部分都变成0；
        int left = N >>j>>1;
        //左移动，将j的右边变成0
        left = left <<j<<1;
        //中部分，将M的右边i位变成0
        int middle = M << i;
        //右部分，将N的i以前部分变成0，如：1左移2位变成100，100(b)-1(b)为011(b)
        int right = N & ((1<<i)-1);
        //三部分结合
        return left | middle | right;
    }
}
