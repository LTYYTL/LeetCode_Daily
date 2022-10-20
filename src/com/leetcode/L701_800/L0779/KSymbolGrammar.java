package com.leetcode.L701_800.L0779;

/**
 * 779. 第K个语法符号
 * 我们构建了一个包含 n 行( 索引从 1  开始 )的表。首先在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 * 例如，对于 n = 3 ，第 1 行是 0 ，第 2 行是 01 ，第3行是 0110 。
 * 给定行数 n 和序数 k，返回第 n 行中第 k 个字符。（ k 从索引 1 开始）
 * <p>
 * 示例 1:
 * 输入: n = 1, k = 1
 * 输出: 0
 * 解释: 第一行：0
 * <p>
 * 示例 2:
 * 输入: n = 2, k = 1
 * 输出: 0
 * 解释:
 * 第一行: 0
 * 第二行: 01
 * <p>
 * 示例 3:
 * 输入: n = 2, k = 2
 * 输出: 1
 * 解释:
 * 第一行: 0
 * 第二行: 01
 * <p>
 * 提示:
 * 1 <= n <= 30
 * 1 <= k <= 2n - 1
 */
public class KSymbolGrammar {
    /**
     * 方法：数学
     * 题解：https://leetcode.cn/problems/k-th-symbol-in-grammar/solution/-by-muse-77-zw7u/
     */
    public int kthGrammar(int n, int k) {
        // 第一列永远是0
        if (k == 1) {
            return 0;
        }

        // 上一行的长度
        int half = 1 << (n - 2);

        // 查询列在当前行增加的部分，则与上一行值不同
        if (k > half) {
            return kthGrammar(n - 1, k - half) ^ 1;
        }
        // 查询列不在当前行增加的部分，则与上一行值相同
        return kthGrammar(n - 1, k);
    }
}
