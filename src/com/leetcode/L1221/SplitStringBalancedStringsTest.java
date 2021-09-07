package com.leetcode.L1221;

public class SplitStringBalancedStringsTest {
    public static void main(String[] args) {
        SplitStringBalancedStrings splitStringBalancedStrings = new SplitStringBalancedStrings();
        /**
         * 示例 1：
         * 输入：s = "RLRRLLRLRL"
         * 输出：4
         * 解释：s 可以分割为 "RL"、"RRLL"、"RL"、"RL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
         */
        System.out.println(splitStringBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
        /**
         * 示例 2：
         * 输入：s = "RLLLLRRRLR"
         * 输出：3
         * 解释：s 可以分割为 "RL"、"LLLRRR"、"LR" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
         */
        System.out.println(splitStringBalancedStrings.balancedStringSplit("RLLLLRRRLR"));
        /**
         * 示例 3：
         * 输入：s = "LLLLRRRR"
         * 输出：1
         * 解释：s 只能保持原样 "LLLLRRRR".
         */
        System.out.println(splitStringBalancedStrings.balancedStringSplit("LLLLRRRR"));
        /**
         * 示例 4：
         * 输入：s = "RLRRRLLRLL"
         * 输出：2
         * 解释：s 可以分割为 "RL"、"RRRLLRLL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
         */
        System.out.println(splitStringBalancedStrings.balancedStringSplit("RLRRRLLRLL"));
    }
}
