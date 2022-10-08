package com.leetcode.L1601_1700.L1652;

import java.util.Arrays;

/**
 * 1652. 拆炸弹
 * 你有一个炸弹需要拆除，时间紧迫！你的情报员会给你一个长度为 n 的 循环 数组 code 以及一个密钥 k 。
 * 为了获得正确的密码，你需要替换掉每一个数字。所有数字会 同时 被替换。
 * (1)如果 k > 0 ，将第 i 个数字用 接下来 k 个数字之和替换。
 * (2)如果 k < 0 ，将第 i 个数字用 之前 k 个数字之和替换。
 * (3)如果 k == 0 ，将第 i 个数字用 0 替换。
 * 由于 code 是循环的， code[n-1] 下一个元素是 code[0] ，且 code[0] 前一个元素是 code[n-1] 。
 * 给你 循环 数组 code 和整数密钥 k ，请你返回解密后的结果来拆除炸弹！
 * <p>
 * 示例 1：
 * 输入：code = [5,7,1,4], k = 3
 * 输出：[12,10,16,13]
 * 解释：每个数字都被接下来 3 个数字之和替换。解密后的密码为 [7+1+4, 1+4+5, 4+5+7, 5+7+1]。注意到数组是循环连接的。
 * <p>
 * 示例 2：
 * 输入：code = [1,2,3,4], k = 0
 * 输出：[0,0,0,0]
 * 解释：当 k 为 0 时，所有数字都被 0 替换。
 * <p>
 * 示例 3：
 * 输入：code = [2,4,9,3], k = -2
 * 输出：[12,5,6,13]
 * 解释：解密后的密码为 [3+9, 2+3, 4+2, 9+4] 。注意到数组是循环连接的。如果 k 是负数，那么和为 之前 的数字。
 * <p>
 * 提示：
 * n == code.length
 * 1 <= n <= 100
 * 1 <= code[i] <= 100
 * -(n - 1) <= k <= n - 1
 */
public class DefuseBomb {
    /**
     * 方法：模拟
     */
    public int[] decrypt(int[] code, int k) {
        // 0的情况
        if (k == 0) {
            Arrays.fill(code, k);
            return code;
        }
        // 大于0，往后走
        if (k > 0) {
            return lastSum(code, k);
        }
        // 小于0，往前走
        return frontSum(code, k);
    }

    /**
     * 计算后面k个和
     */
    private int[] lastSum(int[] code, int k) {
        // 长度
        int n = code.length;
        // 结果
        int[] res = new int[code.length];
        // 遍历
        for (int i = 0; i < code.length; i++) {
            // 后面k个
            for (int j = 1; j <= k; j++) {
                res[i] += code[(i + j) % n];
            }
        }
        return res;
    }

    /**
     * 计算前面k个和
     */
    private int[] frontSum(int[] code, int k) {
        // 长度
        int n = code.length;
        // 结果
        int[] res = new int[code.length];
        // 遍历
        for (int i = 0; i < code.length; i++) {
            // 前面k个
            for (int j = k; j < 0; j++) {
                res[i] += code[(n + i + j) % n];
            }
        }
        return res;
    }
}
