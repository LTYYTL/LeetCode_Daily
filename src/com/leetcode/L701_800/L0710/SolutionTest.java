package com.leetcode.L701_800.L0710;

public class SolutionTest {
    public static void main(String[] args) {
        /**
         * 示例 1：
         * 输入
         * ["Solution", "pick", "pick", "pick", "pick", "pick", "pick", "pick"]
         * [[7, [2, 3, 5]], [], [], [], [], [], [], []]
         * 输出
         * [null, 0, 4, 1, 6, 1, 0, 4]
         * 解释
         * Solution solution = new Solution(7, [2, 3, 5]);
         * solution.pick(); // 返回0，任何[0,1,4,6]的整数都可以。注意，对于每一个pick的调用，
         *                  // 0、1、4和6的返回概率必须相等(即概率为1/4)。
         * solution.pick(); // 返回 4
         * solution.pick(); // 返回 1
         * solution.pick(); // 返回 6
         * solution.pick(); // 返回 1
         * solution.pick(); // 返回 0
         * solution.pick(); // 返回 4
         */
        Solution solution = new Solution(7, new int[]{2, 3, 5});
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
    }
}
