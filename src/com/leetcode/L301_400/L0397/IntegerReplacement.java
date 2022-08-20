package com.leetcode.L301_400.L0397;

import java.util.HashMap;
import java.util.Map;

/**
 * 397. 整数替换
 * 给定一个正整数 n ，你可以做如下操作：
 * (1)如果 n 是偶数，则用 n / 2替换 n 。
 * (2)如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 *
 * 示例 1：
 * 输入：n = 8
 * 输出：3
 * 解释：8 -> 4 -> 2 -> 1
 *
 * 示例 2：
 * 输入：n = 7
 * 输出：4
 * 解释：7 -> 8 -> 4 -> 2 -> 1
 * 或 7 -> 6 -> 3 -> 2 -> 1
 *
 * 示例 3：
 * 输入：n = 4
 * 输出：2
 *
 * 提示：
 * 1 <= n <= 231 - 1
 */
public class IntegerReplacement {
    /**
     * 方法一：暴力法
     * @param n
     * @return
     */
    public int integerReplacement(int n) {
        return dfs(n);
    }

    private int dfs(long n) {
        if (n == 1) return 0;

        if (n % 2 == 0) return dfs(n / 2) + 1;

        return Math.min(dfs(n + 1), dfs(n - 1)) + 1;
    }

    /**
     * 方法二：map映射
     * @param n
     * @return
     */
    public int integerReplacement_map(int n) {
        Map<Long, Integer> memo = new HashMap<>();
        return dfs(n, memo);
    }

    private int dfs(long n, Map<Long, Integer> memo) {
        if (n == 1) return 0;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ans;

        if (n % 2 == 0) {
            ans = dfs(n / 2, memo) + 1;
        } else {
            ans = Math.min(dfs(n + 1, memo), dfs(n - 1, memo)) + 1;
        }

        memo.put(n, ans);

        return ans;
    }

    /**
     * 方法：位运算
     * 作者：tong-zhu
     * 链接：<a href="https://leetcode-cn.com/problems/integer-replacement/solution/tong-ge-lai-shua-ti-la-yi-ti-san-jie-bao-u05f/">https://leetcode-cn.com/problems/integer-replacement/solution/tong-ge-lai-shua-ti-la-yi-ti-san-jie-bao-u05f/</a>
     */
    public int integerReplacement_bit(int n) {
        long num = n;
        int ans = 0;
        while (num > 1) {
            if ((num & 1) == 0) {
                // 是偶数
                num >>= 1;
            } else if ((num & 0b10) == 0 || num == 3) {
                // 0b表示二进制，跟0x表示十六进制一样的
                // 倒数第二位是0，说明只有最低位是1
                // 3是个特例
                num--;//只有最后一位是1
            } else {
                num++;//低位有连续的 1，我们应该做加 1 处理
            }
            ans++;
        }
        return ans;
    }

}
