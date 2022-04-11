package com.leetcode.L301_400.L0357;

/**
 * 357. 统计各位数字都不同的数字个数
 * 给你一个整数 n ，统计并返回各位数字都不同的数字 x 的个数，其中 0 <= x < 10n 。
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：91
 * 解释：答案应为除去 11、22、33、44、55、66、77、88、99 外，在 0 ≤ x < 100 范围内的所有数字。
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：1
 *
 * 提示：
 * 0 <= n <= 8
 */
public class CountUniqueDigits {
    /**
     * 方法：数学
     * @param n
     * @return
     */
    public int countNumbersWithUniqueDigits(int n) {
        //只有一个0
        if(n == 0)
            return 1;
        //0~99情况
        if (n == 1)
            return 10;
        //默认有10个0~9
        int res = 10;
        //第一位可选的情况
        int cur = 9;
        //遍历
        for(int i = 0; i < n-1; ++i){
            //每一位可选择情况总数
            cur *= (9-i);
            res += cur;
        }
        return res;
    }
}
