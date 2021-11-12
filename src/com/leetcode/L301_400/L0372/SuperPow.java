package com.leetcode.L301_400.L0372;

/**
 * 372. 超级次方
 * 你的任务是计算 ab 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
 *
 * 示例 1：
 * 输入：a = 2, b = [3]
 * 输出：8
 *
 * 示例 2：
 * 输入：a = 2, b = [1,0]
 * 输出：1024
 *
 * 示例 3：
 * 输入：a = 1, b = [4,3,3,8,5,2]
 * 输出：1
 *
 * 示例 4：
 * 输入：a = 2147483647, b = [2,0,0]
 * 输出：1198
 *
 * 提示：
 * 1 <= a <= 231 - 1
 * 1 <= b.length <= 2000
 * 0 <= b[i] <= 9
 * b 不含前导 0
 */
public class SuperPow {
    //取模
    private final int MOD = 1337;

    /**
     * 方法：数学
     * @param a
     * @param b
     * @return
     */
    public int superPow(int a, int[] b) {
        return superPow(a,b,b.length-1);
    }

    /**
     * 重载函数
     * @param a
     * @param b
     * @param index
     * @return
     */
    private int superPow(int a,int[] b,int index){
        //都遍历完了
        if (index < 0)
            return 1;
        //取末尾的数，索引向前移
        int last = b[index--];

        //将其拆成两部分
        //a = 2 ，b = [1,5,6,4]
        // a^[1,5,6,4] = a^4 * (a^[1,5,6])^10
        int part1 = mypow(a,last);
        int part2 = mypow(superPow(a,b,index),10);

        return (part1 * part2) % MOD;
    }

    /**
     * 计算幂
     * @param a
     * @param k
     * @return
     */
    private int mypow(int a, int k) {
        //0次为1
        if (k == 0)
            return 1;
        //取模
        a %= MOD;

        //判断是奇偶
        //a ^ b = a * a^(b-1) b为奇数
        //      = (a^(b/2))^2
        if (k % 2 == 1)
            return (a * mypow(a,k-1)) % MOD;
        else{
            int sub = mypow(a,k/2);
            return (sub * sub) % MOD;
        }
    }
}
