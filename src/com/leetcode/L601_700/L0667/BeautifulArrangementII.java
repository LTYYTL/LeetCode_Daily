package com.leetcode.L601_700.L0667;

/**
 * 667. 优美的排列 II
 * 给你两个整数 n 和 k ，请你构造一个答案列表 answer ，该列表应当包含从 1 到 n 的 n 个不同正整数，并同时满足下述条件：
 * 假设该列表是 answer = [a1, a2, a3, ... , an] ，那么列表 [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有 k 个不同整数。
 * 返回列表 answer 。如果存在多种答案，只需返回其中 任意一种 。
 * <p>
 * 示例 1：
 * 输入：n = 3, k = 1
 * 输出：[1, 2, 3]
 * 解释：[1, 2, 3] 包含 3 个范围在 1-3 的不同整数，并且 [1, 1] 中有且仅有 1 个不同整数：1
 * <p>
 * 示例 2：
 * 输入：n = 3, k = 2
 * 输出：[1, 3, 2]
 * 解释：[1, 3, 2] 包含 3 个范围在 1-3 的不同整数，并且 [2, 1] 中有且仅有 2 个不同整数：1 和 2
 * <p>
 * 提示：
 * 1 <= k < n <= 104
 */
public class BeautifulArrangementII {
    /**
     * 方法：数学
     */
    public int[] constructArray(int n, int k) {
        // 差值
        int interval = k;
        // 结果
        int[] answer = new int[n];
        // 初始化
        answer[0] = 1;

        // 遍历满足差值个数
        for (int i = 1; i <= k; i++) {
            // 根据奇偶性反复跳跃区间
            answer[i] = i % 2 == 1 ? answer[i - 1] + interval : answer[i - 1] - interval;
            //差值
            interval--;
        }
        //填充后续
        for (int i = k + 1; i < n; i++) {
            answer[i] = i + 1;
        }
        return answer;
    }
}
