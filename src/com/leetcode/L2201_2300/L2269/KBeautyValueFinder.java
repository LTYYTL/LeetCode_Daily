package com.leetcode.L2201_2300.L2269;

/**
 * 2269. 找到一个数字的 K 美丽值
 * 一个整数 num 的 k 美丽值定义为 num 中符合以下条件的 子字符串 数目：
 * （1）子字符串长度为 k 。
 * （2）子字符串能整除 num 。
 * 给你整数 num 和 k ，请你返回 num 的 k 美丽值。
 *
 * 注意：
 * 允许有 前缀 0 。
 * 0 不能整除任何值。
 * 一个 子字符串 是一个字符串里的连续一段字符序列。
 *
 * 示例 1：
 * 输入：num = 240, k = 2
 * 输出：2
 * 解释：以下是 num 里长度为 k 的子字符串：
 * - "240" 中的 "24" ：24 能整除 240 。
 * - "240" 中的 "40" ：40 能整除 240 。
 * 所以，k 美丽值为 2 。
 *
 * 示例 2：
 * 输入：num = 430043, k = 2
 * 输出：2
 * 解释：以下是 num 里长度为 k 的子字符串：
 * - "430043" 中的 "43" ：43 能整除 430043 。
 * - "430043" 中的 "30" ：30 不能整除 430043 。
 * - "430043" 中的 "00" ：0 不能整除 430043 。
 * - "430043" 中的 "04" ：4 不能整除 430043 。
 * - "430043" 中的 "43" ：43 能整除 430043 。
 * 所以，k 美丽值为 2 。
 *
 * 提示：
 * 1 <= num <= 109
 * 1 <= k <= num.length （将 num 视为字符串）
 */
public class KBeautyValueFinder {
    /**
     * 方法：滑动窗口
     * @param num
     * @param k
     * @return
     */
    public int divisorSubstrings(int num, int k) {
        String numStr = Integer.toString(num);     // 将数字转为字符串
        int n = numStr.length();
        int cnt = 0;                        // 统计满足条件的子串个数
        for(int i = 0; i <= n - k; i++){
            int subNum = Integer.parseInt(numStr.substring(i, i+k));  // 提取长度为k的子串，并转为对应的数字
            if(subNum > 0 && num % subNum == 0){                      // 子串数字不为0 且 可以被num整除
                cnt++;                      // 满足条件的子串个数+1
            }
        }
        return cnt;
    }

}
