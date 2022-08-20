package com.LCP.L0019;

/**
 * LCP 19. 秋叶收藏集
 * 小扣出去秋游，途中收集了一些红叶和黄叶，他利用这些叶子初步整理了一份秋叶收藏集 leaves，
 * 字符串 leaves 仅包含小写字符 r 和 y，其中字符 r 表示一片红叶，字符 y 表示一片黄叶。
 * 出于美观整齐的考虑，小扣想要将收藏集中树叶的排列调整成「红、黄、红」三部分。每部分树叶数量可以不相等，但均需大于等于 1。
 * 每次调整操作，小扣可以将一片红叶替换成黄叶或者将一片黄叶替换成红叶。请问小扣最少需要多少次调整操作才能将秋叶收藏集调整完毕。
 *
 * 示例 1：
 * 输入：leaves = "rrryyyrryyyrr"
 * 输出：2
 * 解释：调整两次，将中间的两片红叶替换成黄叶，得到 "rrryyyyyyyyrr"
 *
 * 示例 2：
 * 输入：leaves = "ryr"
 * 输出：0
 * 解释：已符合要求，不需要额外操作
 *
 * 提示：
 * 3 <= leaves.length <= 10^5
 * leaves 中只包含字符 'r' 和字符 'y'
 */
public class AutumnLeavesCollection {
    public int minimumOperations(String leaves) {
        if (leaves == null || leaves.equals("")) {   // 排除 不合法参数情况
            return 0;
        }
        int length = leaves.length();
        char[] chars = leaves.toCharArray();

        /*
            状态数组，state[i][j]中：
                i表示终止下标
                j表示：0为左半边，1为中间部分，2为右半边
            state[i][j] 表示 从0到i需要调整的叶子数
         */
        int[][] state = new int[length][3];

        /*
            记录 已知状态数组元素：
                1、第一个叶子，必须是左半部分，所以只需判断是不是 黄色叶子 即可
                2、第一个叶子，必须是左半部分，所以 state[0][1] 和 state[0][2] 都是无效的
                3、第二个叶子，可以是左半部分，也可以是中间部分，但是不能是右半部分(每个区间必须有叶子)，
                    因此 state[1][2]是无效的
         */
        state[0][0] = chars[0] == 'y' ? 1 : 0;
        state[0][1] = state[0][2] = state[1][2] = Integer.MAX_VALUE;

        int isYellow;   // 判断 当前遍历的叶子 是不是 黄色

        /*
            遍历 原叶集，生成状态数组
         */
        for (int i = 1; i < length; i++) {
            isYellow = chars[i] == 'y' ? 1 : 0;
            state[i][0] = state[i - 1][0] + isYellow;
            state[i][1] = Math.min(state[i - 1][0], state[i - 1][1]) + (1 - isYellow);
            if (i > 1) {    // 右半部分 的叶子 必须是第2个元素之后的元素
                state[i][2] = Math.min(state[i - 1][1], state[i - 1][2]) + isYellow;
            }
        }

        /*
            最终结果 为 state[length - 1][2]
            因为 state[i][j]最终结果的 i 必须为 length - 1，state[length - 1][j] 中的 j 必须为2
         */
        return state[length - 1][2];
    }

}
