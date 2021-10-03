package com.leetcode.L501_600.L0600;

/**
 * 600. 不含连续1的非负整数
 * 给定一个正整数 n，找出小于或等于 n 的非负整数中，其二进制表示不包含 连续的1 的个数。
 *
 * 示例 1:
 * 输入: 5
 * 输出: 5
 *
 * 解释:
 * 下面是带有相应二进制表示的非负整数<= 5：
 * 0 : 0
 * 1 : 1
 * 2 : 10
 * 3 : 11
 * 4 : 100
 * 5 : 101
 * 其中，只有整数3违反规则（有两个连续的1），其他5个满足规则。
 * 说明: 1 <= n <= 109
 */
public class NoIntegersConsecutiveOnes {
    /**
     * 方法：动态规划
     * @param num
     * @return
     */
    public int findIntegers(int num) {
        int[] dp = new int[32];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < 32; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        //转换成二进制
        String numStr = getBinary(num);
        int res = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0')
                continue;
            res += dp[numStr.length() - i - 1];
            if (i != 0 && numStr.charAt(i - 1) == '1')
                return res;
        }
        return res + 1;
    }
    // 将非负整数转为二进制字符串
    private String getBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0)
        {
            sb.insert(0, num & 1);
            num >>= 1;
        }
        return sb.toString();
    }
}
