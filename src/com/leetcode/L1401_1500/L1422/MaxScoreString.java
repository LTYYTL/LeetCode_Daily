package com.leetcode.L1401_1500.L1422;

/**
 * 1422. 分割字符串的最大得分
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 * <p>
 * 示例 1：
 * 输入：s = "011101"
 * 输出：5
 * 解释：
 * 将字符串 s 划分为两个非空子字符串的可行方案有：
 * 左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5
 * 左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4
 * 左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3
 * 左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2
 * 左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
 * <p>
 * 示例 2：
 * 输入：s = "00111"
 * 输出：5
 * 解释：当 左子字符串 = "00" 且 右子字符串 = "111" 时，我们得到最大得分 = 2 + 3 = 5
 * <p>
 * 示例 3：
 * 输入：s = "1111"
 * 输出：3
 * <p>
 * 提示：
 * 2 <= s.length <= 500
 * 字符串 s 仅由字符 '0' 和 '1' 组成。
 */
public class MaxScoreString {
    /**
     * 方法：模拟
     *
     * @param s
     * @return
     */
    public int maxScore(String s) {
        //转换成字符数组
        char[] chars = s.toCharArray();
        //长度
        int n = chars.length;

        //计算和
        int sum = chars[0] == '1' ? 1 : 0;
        //存储0的个数
        int[] zero = new int[n];
        //存储1的个数
        int[] one = new int[n];
        //第一个单独处理
        zero[0] = chars[0] == '0' ? 1 : 0;
        one[0] = chars[0] == '1' ? 1 : 0;
        //遍历
        for (int i = 1; i < n; i++) {
            //根据字符判读计数
            int zeroNum = chars[i] == '0' ? 1 : 0;
            zero[i] = zero[i - 1] + zeroNum;
            int oneNum = chars[i] == '1' ? 1 : 0;
            one[i] = one[i - 1] + oneNum;
            //计算和
            sum += (chars[i] - '0');
        }

        //结果集
        int res = 0;
        //遍历
        for (int i = 1; i < n; i++) {
            //左右两部分分数
            int zeroSum = zero[i - 1];
            int oneSum = sum - one[i - 1];
            //记录最大
            res = Math.max(zeroSum + oneSum, res);
        }

        return res;
    }
}
