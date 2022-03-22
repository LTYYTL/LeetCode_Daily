package com.leetcode.L2001_2100.L2038;

public class RemoveColoredTest {
    public static void main(String[] args) {
        RemoveColored removeColored = new RemoveColored();
        /**示例 1：
         * 输入：colors = "AAABABB"
         * 输出：true
         * 解释：
         * AAABABB -> AABABB
         * Alice 先操作。
         * 她删除从左数第二个 'A' ，这也是唯一一个相邻颜色片段都是 'A' 的 'A' 。
         *
         * 现在轮到 Bob 操作。
         * Bob 无法执行任何操作，因为没有相邻位置都是 'B' 的颜色片段 'B' 。
         * 因此，Alice 获胜，返回 true 。
         */
        System.out.println(removeColored.winnerOfGame("AAABABB"));
        /**
         * 示例 2：
         * 输入：colors = "AA"
         * 输出：false
         * 解释：
         * Alice 先操作。
         * 只有 2 个 'A' 且它们都在字符串的两端，所以她无法执行任何操作。
         * 因此，Bob 获胜，返回 false 。
         */
        System.out.println(removeColored.winnerOfGame("AA"));
        /**
         * 示例 3：
         * 输入：colors = "ABBBBBBBAAA"
         * 输出：false
         * 解释：
         * ABBBBBBBAAA -> ABBBBBBBAA
         * Alice 先操作。
         * 她唯一的选择是删除从右数起第二个 'A' 。
         *
         * ABBBBBBBAA -> ABBBBBBAA
         * 接下来轮到 Bob 操作。
         * 他有许多选择，他可以选择任何一个 'B' 删除。
         *
         * 然后轮到 Alice 操作，她无法删除任何片段。
         * 所以 Bob 获胜，返回 false 。
         */
        System.out.println(removeColored.winnerOfGame("ABBBBBBBAAA"));
    }
}
