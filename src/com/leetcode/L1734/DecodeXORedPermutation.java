package com.leetcode.L1734;

/**
 * 1734. 解码异或后的排列
 * 给你一个整数数组 perm ，它是前 n 个正整数的排列，且 n 是个 奇数 。
 * 它被加密成另一个长度为 n - 1 的整数数组 encoded ，满足 encoded[i] = perm[i] XOR perm[i + 1] 。
 * 比方说，如果 perm = [1,3,2] ，那么 encoded = [2,1] 。
 * 给你 encoded 数组，请你返回原始数组 perm 。题目保证答案存在且唯一。
 *
 * 示例 1：
 * 输入：encoded = [3,1]
 * 输出：[1,2,3]
 * 解释：如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]
 *
 * 示例 2：
 * 输入：encoded = [6,5,4,6]
 * 输出：[2,4,1,5,3]
 *
 * 提示：
 * 3 <= n < 105
 * n 是奇数。
 * encoded.length == n - 1
 */
public class DecodeXORedPermutation {
    /**
     * 方法：数学
     * 解题思路
     * 原数组：prem[A、B、C、D、E]
     * 现数组：encoded[AB、BC、CD、DE]
     * 所以A = ABCDE ^ BCDE
     * 即:原数组是前n项的排列，ABCDE为前n个元素的异或
     *    BCDE是现数组每隔一项的异或
     * @param encoded
     * @return
     */
    public int[] decode(int[] encoded) {
        int n = encoded.length;

        //前n个数的异或结果
        int ABCDE = 0;
        for (int i = 1; i <= n+1; i++) {
            ABCDE ^= i;
        }

        int BCDE = 0;
        for (int i = 1; i < n; i+=2) {
            BCDE ^= encoded[i];
        }

        int[] prem = new int[n+1];
        prem[0] = ABCDE ^ BCDE;
        for (int i = 1; i < n+1; i++) {
            prem[i] = prem[i-1] ^ encoded[i-1];
        }

        return prem;
    }
}
